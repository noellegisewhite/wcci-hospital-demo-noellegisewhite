package project;

public class Patient {

    // Variables
    private int patientHealth;
    private int bloodLevel;

    // Getter
    public int getPatientHealth() {
        return patientHealth;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    // Constructor
    public Patient() {
        patientHealth = 10;
        bloodLevel = 20;
    }

    // Methods
    public void increaseHealth(int healthIncreaseAmount) {
        patientHealth += healthIncreaseAmount;
    }

    public void drawBlood(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
