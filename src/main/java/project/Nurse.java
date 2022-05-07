package project;

public class Nurse extends HospitalEmployee {

    // Variables
    private int nurseNumPatients;

    // Getters
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getNurseNumPatients() {
        return nurseNumPatients;
    }

    // Constructor
    public Nurse(String employeeNumber, String employeeName, int nurseNumPatients) {
        super(employeeNumber, employeeName);
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.nurseNumPatients = nurseNumPatients;
    }

    // Methods
    public void provideCare(Patient carePatient) {
        carePatient.increaseHealth(20);
    }

    public void drawBlood(Patient carePatient) {
        carePatient.drawBlood(5);
    }

    @Override
    public int calculateSalary() {
        return 50000;
    }
}
