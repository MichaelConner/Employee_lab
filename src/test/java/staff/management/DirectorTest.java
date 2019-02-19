package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    private Director director;

    @Before
    public void before(){
        director = new Director("Gilroy Monsanto", "JS324509D", 120000.00, "Marketing", 1000000);

    }

    @Test
    public void hasDeptName(){
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Gilroy Monsanto", director.getName());
    }

    @Test
    public void hasNino(){
        assertEquals("JS324509D", director.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(120000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(121000.00, director.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2400.00, director.payBonus(), 0.01);
    }

}
