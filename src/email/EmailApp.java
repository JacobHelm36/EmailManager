package email;

import java.util.Scanner;

public class EmailApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first name: ");
    String firstName = scanner.nextLine();
    System.out.println("Enter your last name: ");
    String lastName = scanner.nextLine();
    System.out.println("Enter an alternate email: ");
    String altEmail = scanner.nextLine();
    Email em1 = new Email(firstName, lastName);
  }
}