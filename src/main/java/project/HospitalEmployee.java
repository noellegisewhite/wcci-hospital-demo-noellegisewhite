package project;

public abstract class HospitalEmployee {
    // Variables
    protected String employeeNumber;
    protected String employeeName;

    public HospitalEmployee(String employeeNumber, String employeeName) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
    }

    public abstract int calculateSalary();
}
