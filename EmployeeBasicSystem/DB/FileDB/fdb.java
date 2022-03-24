package DB.FileDB;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import Models.EmpModel;

public class fdb {
    // Add Employee to the FDB
    public String addEmp(EmpModel model) {
        File file = new File("DB/fdb.txt");
        String pre_data = getAllData();
        try {
            FileWriter writer = new FileWriter(file);
            if(pre_data.isBlank()) {
                writer.append(model.toString());
            } else {
                writer.append(pre_data + "\n" + model.toString());
            }
            writer.close();
            return "Successfully Inserted Data";
        } catch(IOException e) {
            return "Error Occured: " + e.getMessage();
        }
    }

    // Get All the Data from FDB
    public String getAllData() {
        File file = new File("DB/fdb.txt");
        try {
            FileReader reader = new FileReader(file);
            int ch;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            reader.close();
            return sb.toString();
        } catch(Exception e) {
            return "Error Occured: " + e.getMessage();
        }
    }

    // Delete Employee by ID
    public String deleteEmployee(String id) {
        if(getAllData().contains(id)) {
            String[] arr = getAllData().split("EmpModel");
            try {
                FileWriter writer = new FileWriter(new File("DB/fdb.txt"));
                StringBuffer sb = new StringBuffer();
                for (String s : arr) {
                    if(!s.contains(id)) {
                        if(s.startsWith("EmpModel")) {
                            sb.append(s);
                        } else {
                            sb.append("EmpModel" + s);
                        }
                    }
                }
                writer.append(sb.toString());
                writer.close();
                return "Deleted Employee with Id="+id;
            } catch(Exception e) {
                return "Error Occured: "+e.getMessage();
            }
        }
        return "Id is incorrect";
    }

    public static void main(String[] args) {
        System.out.println(new fdb().deleteEmployee("874ddf01-cca3-4d2b-9214-9ab81797452a"));
    }
}
