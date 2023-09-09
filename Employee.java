import java.util.*;
public class Employee {
    
    private String name;
    private int age;
    private List <String> skills;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.skills = new ArrayList<String>();
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    
    public List<String> getSkills() {
        return skills;
    }
    
    public void display() {
         String skillsString = String.join(", ", getSkills());
         System.out.println("Name: " + getName() + "\nAge " + getAge());
         System.out.println("Skills: " + skillsString);
    
         System.out.println("----------");
    }
}
