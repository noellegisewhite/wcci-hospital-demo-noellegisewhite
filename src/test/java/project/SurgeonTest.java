package project;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SurgeonTest {

    Surgeon surgeonTest = new Surgeon ("1", "surgeon", "specialty", true);
    Patient patientTest = new Patient();

    @Test
    public void willIncreasePatientHealthFrom10To20WhenSurgeonCare() {
        surgeonTest.provideCare(patientTest);
        int healthLevel = patientTest.getPatientHealth();
        assertThat(healthLevel, is(20));
    }

    @Test
    public void willDecreasePatientBloodLevelFrom20To15WhenSurgeonDrawBlood() {
        surgeonTest.drawBlood(patientTest);
        int bloodLevel = patientTest.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

    @Test
    public void willReturnDoctorSalaryOf120K() {
        int surgSalary = surgeonTest.calculateSalary();
        assertEquals(120000, surgSalary);
    }

}
