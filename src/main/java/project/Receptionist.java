package project;

public class Receptionist extends HospitalEmployee {

    // Variables
    private boolean onPhone;

    // Getters

    public boolean isOnPhone() {
        return true;
    }

    // Constructor
    public Receptionist(String employeeNumber, String employeeName, boolean onPhone) {
        super(employeeNumber, employeeName);
        this.onPhone = onPhone;
    }

    // Methods

    @Override
    public int calculateSalary(){
        return 50000;
    }

}
