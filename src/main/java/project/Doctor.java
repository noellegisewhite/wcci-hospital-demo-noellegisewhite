package project;

public class Doctor {

    // Variables
    private String doctorNumber;
    private String doctorName;
    private String doctorSpecial;
    private int doctorSalary;

    // Getters
    public String getDoctorNumber() {
        return doctorNumber;
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
    public Doctor(String doctorNumber, String doctorName, String doctorSpecial) {
        this.doctorNumber = doctorNumber;
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
