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
        try {
            FileWriter writer = new FileWriter(file);
            String pre_data = getAllData();
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
    public String[] deleteEmployee(String id) {
        String[] arr = getAllData().split("EmpModel");

        for (String a : arr) {
            // EmpModel emp = (EmpModel) a;
        }
        return arr;
    }
}
