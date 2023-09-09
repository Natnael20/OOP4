import java.util.List;
import java.util.ArrayList;
public class Main {
    
    public static void printout(List<Employee> employees) {
        for(Employee employee:employees) {
            employee.display();
        }
}
    
    public static void main(String args[]) {
      
        Employee employee1 = new Employee("Natnael",20);
        Employee employee2 = new Employee("Jonathen",40);
      
        // Create a list to store employee objects
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        
        // Create a list to store employee skills
        List<String> skills = new ArrayList<>();
        skills.add("Web developer");
        skills.add("Backend developer");
        skills.add("UI/UX designer.");

        // Combine employee skills with the employee1 object
        employee1.setSkills(skills);

        //calling the method
        //It will get print out by for-loop
        printout(employees);

      
      
    }
}
