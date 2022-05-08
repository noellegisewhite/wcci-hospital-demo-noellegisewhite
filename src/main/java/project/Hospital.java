package project;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class Hospital {

    Map<String, HospitalEmployee> workerList = new HashMap<>();

    public void hireNewStaff(HospitalEmployee staffToHire) {
        workerList.put(staffToHire.getEmployeeNumber(), staffToHire);
    }

    public HospitalEmployee findStaff(String idToFind) {
        return workerList.get(idToFind);
    }

    public Collection<HospitalEmployee> findAllStaff() {
        return workerList.values();
    }

    public void displayStaffNames() {
        for(HospitalEmployee staffIndex : workerList.values()) {
            System.out.println(staffIndex.getEmployeeName());
        }
    }
}
