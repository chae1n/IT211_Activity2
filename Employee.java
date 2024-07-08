public class Employee {
    // Attributes of the Employee class
    private String name;
    private String jobTitle;
    private double salary;
    // Constructor to initialize  the Employee object
    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    // Getter Method for the name Attribute
    public String getName(){
        return name;
    }
    // Setter method for the name Attribute
    public void setName(String name){
        this.name = name;
    }
    // Getter Method for the Job title Attribute
    public String getJobTitle(){
        return jobTitle;
    }
    // Setter method for the Job title Attribute
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    // Getter Method for the Salary Attribute
    public double getSalary(){
        return salary;
    }
    // Setter method for the Salary Attribute
    public void setSalary(double salary){
        this.salary = salary;
    }
    // Method to calculate the annual salary
    public double calculateAnnualSalary(){
        return salary * 12; // Annual salary formula: Monthly salary * 12
    }
    // Method to give a raise by a certain percentage
    public void giveRaise(double percentage){
        salary += salary * (percentage /100); // Increase salary by a percentage
    }
    public static void main(String[] args){
            // Create an instance of the employee class
            Employee employee = new Employee("Jerry Nguyen", "Software Engineer", 5000.0);
        // Print the initial details of the employee
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        // Give the employee a 10% raise
        employee.giveRaise(10);

        // Print the updated details of the employee
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
    }
}