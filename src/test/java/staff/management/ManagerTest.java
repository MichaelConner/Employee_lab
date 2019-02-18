package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;


    @Before
    public void before(){
        manager = new Manager("Clive Edwards", "JS832149D", 60000.00, "Marketing");

    }


    @Test
    public void hasDeptName(){
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Clive Edwards", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Alabaster Tabernathy");
        assertEquals("Alabaster Tabernathy", manager.getName());
    }

    @Test
    public void cannotChangeNameToBlank(){
        manager.setName("");
        assertEquals("Clive Edwards", manager.getName());
    }

    @Test
    public void hasNino(){
        assertEquals("JS832149D", manager.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(61000.00, manager.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void cannotLowerSalary() {
        assertEquals(60000.00, manager.raiseSalary(-0.01), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByZero() {
        assertEquals(60000.00, manager.raiseSalary(0), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600.00, manager.payBonus(), 0.01);
    }

}
