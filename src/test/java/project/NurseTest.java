package project;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class NurseTest {

    // Setup
    Nurse nurseTest = new Nurse ("1", "nurse", 2);
    Patient patientTest = new Patient();

    @Test
    public void willIncreasePatientHealthFrom10To30WhenNurseCare() {
        nurseTest.provideCare(patientTest);
        int healthLevel = patientTest.getPatientHealth();
        assertThat(healthLevel, is(30));
    }

    @Test
    public void willDecreasePatientBloodLevelFrom20To15WhenNurseDrawBlood() {
        nurseTest.drawBlood(patientTest);
        int bloodLevel = patientTest.getBloodLevel();
        assertThat(bloodLevel, is(15));
    }

    @Test
    public void willReturnNurseSalaryOf50K() {
        int nurseSalary = nurseTest.calculateSalary();
        assertThat(nurseSalary, is(50000));
    }

}
