package staff.techStaff;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steve Lewis", "BD347831C", 30000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Steve Lewis", developer.getName());
    }

    @Test
    public void canGetNino(){
        assertEquals("BD347831C", developer.getNino());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(31000.00, developer.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, developer.payBonus(), 0.01);
    }
}
