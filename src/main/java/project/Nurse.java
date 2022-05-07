package project;

public class Nurse {

    // Variables
    private String nurseNumber;
    private String nurseName;
    private int nurseNumPatients;

    // Getters
    public String getNurseNumber() {
        return nurseNumber;
    }

    public String getNurseName() {
        return nurseName;
    }

    public int getNurseNumPatients() {
        return nurseNumPatients;
    }

    // Constructor
    public Nurse(String nurseNumber, String nurseName, int nurseNumPatients) {
    }

    // Methods
    public void provideCare(Patient carePatient) {
        carePatient.increaseHealth(20);
    }

    public void drawBlood(Patient carePatient) {
        carePatient.drawBlood(5);
    }

    public int calculateSalary() {
        return 50000;
    }
}
