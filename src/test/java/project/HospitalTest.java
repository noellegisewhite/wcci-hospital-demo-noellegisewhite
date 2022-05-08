package project;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class HospitalTest {

    Hospital testHospital = new Hospital();
    Doctor doctorTest = new Doctor("1","Greg House","Diagnostic Medicine");
    Nurse nurseTest = new Nurse("2", "Margaret Houlihan", 8);
    Janitor janitorTest = new Janitor("3","Groundskeeper Willie",false);


    @Test
    public void willHireAndReturnNewDoctor() {
        testHospital.hireNewStaff(doctorTest);
        HospitalEmployee foundStaff = testHospital.findStaff("1");
        assertThat(foundStaff.getEmployeeName(), is("Greg House"));
    }

    @Test
    public void willHireAndReturnNewNurse() {
        testHospital.hireNewStaff(nurseTest);
        HospitalEmployee foundStaff = testHospital.findStaff("2");
        assertThat(foundStaff.getEmployeeName(), is("Margaret Houlihan"));
    }

    @Test
    public void willHireAndReturnNewJanitor() {
        testHospital.hireNewStaff(janitorTest);
        HospitalEmployee foundStaff = testHospital.findStaff("3");
        assertThat(foundStaff.getEmployeeName(), is("Groundskeeper Willie"));
    }

    @Test
    public void willHireAndReturnAllStaffObjects() {
        testHospital.hireNewStaff(doctorTest);
        testHospital.hireNewStaff(nurseTest);
        testHospital.hireNewStaff(janitorTest);
        Collection<HospitalEmployee> staffList = testHospital.findAllStaff();
        assertThat(staffList, containsInAnyOrder(nurseTest, janitorTest, doctorTest));
    }
}
