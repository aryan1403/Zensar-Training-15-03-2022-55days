package DB.FileDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;

import Models.EmpModel;

public class fdb {
    // Add Employee to the FDB
    public String addEmp(EmpModel model) {
        File file = new File("DB/fdb.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(model); // Serializing

            oos.flush();
            oos.close();
            return "Successfully Inserted Data";
        } catch (IOException e) {
            return "Error Occured: " + e.getMessage();
        }
    }

    // Get All the Data from FDB
    public String getAllData() {
        File file = new File("DB/fdb.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            String data = ois.readObject().toString(); // DeSerializing
            ois.close();
            return data;
        } catch (Exception e) {
            return "Error Occured: " + e.getMessage();
        }
    }

    // Delete Employee by ID
    public String deleteEmployee(String id) {
        File file = new File("DB/fdb.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            EmpModel emp = (EmpModel) ois.readObject();
            ois.close();
            System.out.println(emp);

            if (emp.getId().equals(id)) {
                return "Deleted Employee with Id=" + id;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error Occured: " + e);
        }
        return "Id is incorrect";
    }

    public static void main(String[] args) {
        System.out.println(
                new fdb().addEmp(new EmpModel(UUID.randomUUID().toString(), "a", 1.0, "a", "c", 1.0, "a", "1", "a")));
        System.out.println(new fdb().getAllData());
        System.out.println(new fdb().deleteEmployee("9967fb87-3448-4504-b0a4-e149b12ce027"));
    }
}
