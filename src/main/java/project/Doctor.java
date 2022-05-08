package project;

public class Doctor extends HospitalEmployee implements MedicalDuty {

    // Variables
    private String doctorSpecial;
    private int doctorSalary;

    // Getters
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDoctorSpecial() {
        return doctorSpecial;
    }

    public int getDoctorSalary() {
        return doctorSalary;
    }

    // Constructor
    public Doctor(String employeeNumber, String employeeName, String doctorSpecial) {
        super(employeeNumber, employeeName);
        this.doctorSpecial = doctorSpecial;
    //    doctorSalary = 90000;
    }

    // Methods
    @Override
    public void provideCare(Patient newPatient) {
        newPatient.increaseHealth(10);
    }

    @Override
    public void drawBlood(Patient newPatient) {
        newPatient.drawBlood(5);
    }

    @Override
    public int calculateSalary() {
        return 90000;
    }
}
