package project;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class DoctorTest {

    Doctor doctorTest = new Doctor("1", "name", "speciality");
    Patient newPatient = new Patient();

    @Test
    public void willIncreasePatientHealthFrom10To20WhenDoctorCare() {
        doctorTest.provideCare(newPatient);
        int patientHealth = newPatient.getPatientHealth();
        assertEquals(20, patientHealth);
    }

    @Test
    public void willDecreasePatientBloodLevelFrom20To15WhenDoctorDrawBlood() {
        doctorTest.drawBlood(newPatient);
        int bloodLevel = newPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

//    Test that I created
//    @Test
//    public void willReturnSalaryOf$90() {
//        int docSalary = doctorTest.getDoctorSalary();
//        assertEquals(90000, docSalary);
//    }

    @Test
    public void willReturnSalaryOf$90() {
        int docSalary = doctorTest.calculateSalary();
        assertEquals(90000, docSalary);
    }
}
