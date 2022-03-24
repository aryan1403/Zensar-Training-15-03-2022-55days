import java.util.Scanner;
import java.util.UUID;
import DB.FileDB.fdb;
import Models.EmpModel;

public class App {
    public static EmpModel TakeInfoForEmployee() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Enter Employee Name : ");
        String name = sc2.nextLine();
        System.out.print("Enter your salary : ");
        double salary = sc.nextDouble();
        System.out.print("Enter your Role : ");
        String role = sc2.nextLine();
        System.out.print("Enter your Company's name : ");
        String company = sc2.nextLine();
        System.out.print("Enter your total Experince : ");
        double exp = sc2.nextDouble();
        System.out.print("Enter your Address : ");
        String address = sc.nextLine();
        System.out.print("Enter your Phone number : (+91) ");
        String phone_no = sc.nextLine();
        System.out.print("Enter your DOB : ");
        String dob = sc.nextLine();

        EmpModel emp = new EmpModel(UUID.randomUUID().toString(), name, salary, role, company, exp, address, phone_no, dob);
        sc.close();
        sc2.close();
        return emp;
    }

    public static String deleteEmployeeById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        sc.close();

        return new fdb().deleteEmployee(id);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management System\n");
        System.out.println("Available Options :-");
        
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add an Employee");
            System.out.println("2. Get all Employee's");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    EmpModel emp = TakeInfoForEmployee();
                    System.out.println(new fdb().addEmp(emp) + "\n");
                    break;
                case 2:
                    String data = new fdb().getAllData();
                    if(data.isBlank()) {
                        System.out.println("No Employee Exist's\n");
                    } else {
                        System.out.println(data + "\n");
                    }
                    break;
                case 3:
                    System.out.println(deleteEmployeeById());
                    break;
                case 4: 
                    System.out.println("Thanks for using our Employee System\n");
                    sc.close();
                    // Exiting...
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice!\n");
                    break;
            }
        }
    }
}