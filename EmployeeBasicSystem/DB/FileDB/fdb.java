package DB.FileDB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import Models.EmpModel;

public class fdb {
    public EmpModel destructureString(List<String> l) {
        EmpModel model = new EmpModel();
        for (int i = 0; i < l.size(); i++) {
            if (i == 0) {
                model.setAddress(l.get(i).replace("address=", ""));
            }
            if (i == 1) {
                model.setCompany(l.get(i).replace("company=", ""));
            }
            if (i == 2) {
                model.setDob(l.get(i).replace("dob=", ""));
            }
            if (i == 3) {
                model.setExp(Double.parseDouble(l.get(i).replace("exp=", "")));
            }
            if (i == 4) {
                model.setId(l.get(i).replace("id=", ""));
            }
            if (i == 5) {
                model.setName(l.get(i).replace("name=", ""));
            }
            if (i == 6) {
                model.setPhone_no(l.get(i).replace("phone_no=", ""));
            }
            if (i == 7) {
                model.setRole(l.get(i).replace("role=", ""));
            }
            if (i == 8) {
                String salary = l.get(i).replace("salary=", "");
                salary = salary.substring(0, salary.length() - 1);
                model.setSalary(Double.parseDouble(salary));
            }
        }
        return model;
    }

    // Load the Data from fdb.txt
    public void loadData(List<EmpModel> list) {
        try {
            FileReader reader = new FileReader(new File("DB/fdb.txt"));
            BufferedReader br = new BufferedReader(reader);

            while (br.read() != -1) {
                String d = br.readLine();
                d = d.substring(9, d.length() - 1);
                EmpModel model = destructureString(Arrays.asList(d.split(", ")));

                list.add(model);
            }
            list.forEach(System.out::println);
            System.out.println("Successfully Loaded Data");
        } catch (IOException f) {
            System.out.println(f.getMessage());
        }
    }

    // Add Employee to the FDB
    public String addEmp(EmpModel model, List<EmpModel> list) {
        File file = new File("DB/fdb.txt");
        try {
            // FileOutputStream fos = new FileOutputStream(file);
            // ObjectOutputStream oos = new ObjectOutputStream(fos);

            // oos.writeObject(model); // Serializing

            // oos.flush();
            // oos.close();

            list.add(model);
            FileWriter writer = new FileWriter(file);
            StringBuffer sb = new StringBuffer();

            for (EmpModel e : list) {
                sb.append(e.toString() + "\n");
            }
            writer.append(sb.toString());

            writer.close();
            return "Successfully Inserted Data";
        } catch (IOException e) {
            return "Error Occured: " + e.getMessage();
        }
    }

    // Get All the Data from FDB
    public String getAllData(List<EmpModel> list) {
        return list.toString();
    }

    // Delete Employee by ID
    public String deleteEmployee(String id, List<EmpModel> list) {
        try {
            for (EmpModel e : list) {
                if (e.getId().equals(id)) {
                    list.remove(e);
                    FileWriter writer = new FileWriter(new File("DB/fdb.txt"));
                    String data = list.toString();
                    writer.append(data);

                    writer.close();
                    return "Deleted Employee with Id=" + id;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Id is incorrect";

    }
}
