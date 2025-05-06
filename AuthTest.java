import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class AuthTest {
    public static void authenticate(String username, String password) throws AuthenticationException {
        String correctUsername = "admin";
        String correctPassword = "12345";

        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            throw new AuthenticationException("Authentication failed: Invalid username or password");
        } else {
            System.out.println("Login successful!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        try {
            authenticate(user, pass);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

