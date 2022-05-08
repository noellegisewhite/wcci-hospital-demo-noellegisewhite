package project;

public abstract class HospitalEmployee {
    // Variables
    protected String employeeNumber;
    protected String employeeName;

    // Getters
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // Constructor
    public HospitalEmployee(String employeeNumber, String employeeName) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
    }

    public abstract int calculateSalary();
}
