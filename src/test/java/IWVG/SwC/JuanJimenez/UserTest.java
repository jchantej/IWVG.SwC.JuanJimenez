package IWVG.SwC.JuanJimenez;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;
    
    @Before
    public void before() {
        user = new User(32, "Juan", "Jimenez");
    }

    @Test
    public void testUser() {
        assertEquals(32, user.getNumber());
        assertEquals("Juan", user.getName());
        assertEquals("Jimenez", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Juan Jimenez", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J.", user.initials());
    }

}
