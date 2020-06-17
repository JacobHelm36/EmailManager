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
    em1.setAlternateEmail(altEmail);
    System.out.println("Would you like to change your password? Yes or No");
    String passYesNo = scanner.nextLine();
    passYesNo.toLowerCase();
    if (passYesNo == "yes") {
      String newPassword = scanner.nextLine();
      em1.changePassword(newPassword);
    }
    if (passYesNo == "no") {
      System.out.println("You have the same password: " + em1.getPassword());
    }
    else {
      System.out.println("I didn't understand that input.");
    }
  }
}