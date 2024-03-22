public class Main {
    public static void main(String[] args) {
    // create four Employee objects with initial values
    Employee emp1 = new Employee(1010, "Ahmad", "0810101010", 21000);
    Employee emp2 = new Employee(1487, "Son", "0811121314", 23000);
    Employee emp3 = new Employee(1416, "Mark", "0800112233", 17000);
    Employee emp4 = new Employee(1129, "Natnael", "0824272427", 27000); 
    // create an array of Employee objects
    Employee[] employees = {emp1, emp2, emp3, emp4}; 
    // display information of Employee who has name = Ahmad
    for (Employee emp : employees) {
    if (emp.getName().equals("Ahmad")) {
    System.out.println("ID: " + emp.getID());
    System.out.println("Name: " + emp.getName());
    System.out.println("Mobile: " + emp.getMobile());
    System.out.println("Salary: " + emp.getSalary());
    }
    }
    }
   }
   