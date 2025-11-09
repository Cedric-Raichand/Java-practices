import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    // Method to generate random password
    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                "!@#$%^&*()-_=+[]{}|;:,.<>?/";

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Random Password Generator!");

        while (true) {
            System.out.print("Enter the length of your password (e.g., 8, 12, 16): ");
            int length;
            try {
                length = Integer.parseInt(scanner.nextLine());
                if (length <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            String password = generatePassword(length);
            System.out.println("Your random password is: " + password);

            System.out.print("Do you want to generate another password? (y/n): ");
            String again = scanner.nextLine().trim().toLowerCase();
            if (!again.equals("y")) {
                System.out.println("Goodbye! Stay safe online!");
                break;
            }
        }

        scanner.close();
    }
}
