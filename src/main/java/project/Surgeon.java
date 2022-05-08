package project;

public class Surgeon extends Doctor {

    // Variables
    private boolean inSurgery;

    // Getters
    public boolean isInSurgery() {
        return true;
    }

    // Constructor
    public Surgeon(String employeeNumber, String employeeName, String doctorSpecial, boolean inSurgery) {
        super(employeeNumber, employeeName, doctorSpecial);
        this.inSurgery = inSurgery;
    }

    // Methods
    @Override
    public int calculateSalary() {
        return 120000;
    }
}
