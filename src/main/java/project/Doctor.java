package project;

public class Doctor {

    // Variables
    private String employeeNumber;
    private String doctorName;
    private String doctorSpecial;
    private int doctorSalary;

    // Getters
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSpecial() {
        return doctorSpecial;
    }

    public int getDoctorSalary() {
        return doctorSalary;
    }

    // Constructor
    public Doctor(String employeeNumber, String doctorName, String doctorSpecial) {
        this.employeeNumber = employeeNumber;
        this.doctorName = doctorName;
        this.doctorSpecial = doctorSpecial;
    //    doctorSalary = 90000;
    }

    // Methods
    public void provideCare(Patient newPatient) {
        newPatient.increaseHealth(10);

    }

    public void drawBlood(Patient newPatient) {
        newPatient.drawBlood(5);
    }

    public int calculateSalary() {
        return 90000;
    }
}
