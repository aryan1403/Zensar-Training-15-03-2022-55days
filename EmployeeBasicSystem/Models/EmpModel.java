package Models;

import java.io.Serializable;

public class EmpModel implements Serializable {
    String id;
    String name;
    double salary;
    String role;
    String company;
    double exp;
    String address;
    String phone_no;
    String dob;

    @Override
    public String toString() {
        return "EmpModel [address=" + address + ", company=" + company + ", dob=" + dob + ", exp=" + exp + ", id=" + id
                + ", name=" + name + ", phone_no=" + phone_no + ", role=" + role + ", salary=" + salary + "]";
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public double getExp() {
        return exp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public EmpModel(String id, String name, double salary, String role, String company, double exp, String address,
            String phone_no, String dob) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.company = company;
        this.exp = exp;
        this.address = address;
        this.phone_no = phone_no;
        this.dob = dob;
    }

    
}
