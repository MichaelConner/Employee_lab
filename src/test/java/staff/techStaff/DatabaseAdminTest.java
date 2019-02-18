package staff.techStaff;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Phil Lewis", "BD347831D", 32000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Phil Lewis", databaseAdmin.getName());
    }

    @Test
    public void canGetNino(){
        assertEquals("BD347831D", databaseAdmin.getNino());
    }

    @Test
    public void canGetSalary(){
        assertEquals(32000.00, databaseAdmin.getSalary(), 0.01);
    }
}
