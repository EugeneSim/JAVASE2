package Assessment;

/**
 * Employee
 */
    public class Employee {

    private String name;
    private String role;
    private String dept;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    // New method to calculate withholding tax
    public double calculateWithholdingTax() {
        return salary * 0.07; // 7% withholding tax
    }

    // New method to calculate bonus
    public double calculateBonus() {
        return salary * 0.02; // 2% bonus
    }
}

//Reasoning: Encapsulation, keeping the calculation within the class
//Code cohesion and readability, simplicity

