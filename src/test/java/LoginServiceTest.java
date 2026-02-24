import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginServiceTest {
    @Test
    public void testLoginWithValidCredentials() {
        LoginService service = new LoginService();
        boolean result = service.login("user", "pass");
        Assertions.assertTrue(result);
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        LoginService service = new LoginService();
        boolean result = service.login("invalid", "wrong");
        Assertions.assertFalse(result);
    }

    @Test
    public void testLoginWithEmptyFields() {
        LoginService service = new LoginService();
        boolean result = service.login("", "");
        Assertions.assertFalse(result);
    }

    @Test
    public void testLoginWithNullFields() {
        LoginService service = new LoginService();
        boolean result = service.login(null, null);
        Assertions.assertFalse(result);
    }
}
