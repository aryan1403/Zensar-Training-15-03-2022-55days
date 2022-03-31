package meow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeGroup {
    String name;
    String role;
    double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public EmployeeGroup(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    
}

public class groupartyex {
    static List<EmployeeGroup> list = new ArrayList<>();
    static {
        EmployeeGroup eg1 = new EmployeeGroup("Aaryan", "Trainer", 100000);
        EmployeeGroup eg12 = new EmployeeGroup("Arush", "Trainer", 100000);
        EmployeeGroup eg2 = new EmployeeGroup("Meow", "Tester", 12345);
        EmployeeGroup eg3 = new EmployeeGroup("Meow2", "Developer", 1000);
        EmployeeGroup eg4 = new EmployeeGroup("Meow3", "Tester", 344444);
        EmployeeGroup eg5 = new EmployeeGroup("Meow4", "Developer", 50000);

        list.add(eg1);
        list.add(eg12);
        list.add(eg2);
        list.add(eg3);
        list.add(eg4);
        list.add(eg5);

    }
    public static void main(String[] args) {
        list.stream().collect(Collectors.groupingBy(EmployeeGroup::getRole))
            .forEach((k, v) -> {
                System.out.println("Employee with Role " + k + " are :-");
                v.forEach(e -> {
                    System.out.println(e.getName());
                });
                System.out.println();
        });
        list.stream().collect(Collectors.partitioningBy(e -> (e.salary > 2000)))
            .forEach((k, v) -> {
                if(k == false) {
                    System.out.println("Employee having Salary of less than 2000 are :- ");
                    v.forEach(e -> System.out.println(e.getName()));
                    System.out.println();
                } else {
                    System.out.println("Employee having Salary of more than 2000 are :- ");
                    v.forEach(e -> System.out.println(e.getName()));
                }
        });

    }
}
