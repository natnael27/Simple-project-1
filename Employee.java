public class Employee {
    private int ID;
    private String name;
    private String mobile;
    private double salary; 
    public Employee(int ID, String name, String mobile, double salary) {
    this.ID = ID;
    this.name = name;
    this.mobile = mobile;
    this.salary = salary;
    } 
    public int getID() {
    return ID;
    } 
    public String getName() {
    return name;
    } 
    public String getMobile() {
    return mobile;
    } 
    public double getSalary() {
    return salary;
    }
   }