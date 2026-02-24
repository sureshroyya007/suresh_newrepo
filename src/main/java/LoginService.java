public class LoginService {
    public boolean login(String username, String password) {
        // Dummy implementation: Replace with real authentication logic
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return false;
        }
        // Example: valid credentials are 'user' and 'pass'
        return username.equals("user") && password.equals("pass");
    }
}
