package project;

public class Janitor extends HospitalEmployee{

    // Variables
    private boolean sweepFloor;

    // Getters
    public boolean isSweepFloor() {
        return true;
    }

    // Constructor
    public Janitor(String employeeNumber, String employeeName, boolean sweepFloor) {
        super(employeeNumber, employeeName);
        this.sweepFloor = sweepFloor;
    }

    // Methods
    @Override
    public int calculateSalary() {
        return 40000;
    }
}
