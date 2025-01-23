
import java.util.Scanner;

public class Demo008{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            if (username.equals("Dhanvanth") && password.equals("Dhanvanth@123")) {
                System.out.println(username + "Welcome to Mallareddy University");
                break;
            } else {
                System.out.println("Incorrect username or password. Please try again.\n");
            }
        } while (true);

        scanner.close();
    }
}
