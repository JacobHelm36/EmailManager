package email;

import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String email;
  private String department;
  private int mailboxCapacity = 500;
  private int passwordLength = 10;
  private String alternateEmail;
  private String companyName = "aeycompany.com";

  // Constructor receive first and last name
  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Email created: " + this.firstName + " " + this.lastName);

    // method for getting the department
    this.department = setDepartment();
    System.out.println("Department: " + this.department);

    // method for getting random password
    this.password = randPassword(passwordLength);
    System.out.println("Password: " + this.password);

    // combine elements to generate email
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
    System.out.println("Your email is: " + email);
  }
  // Ask for department
  private String setDepartment() {
    System.out.println("Department Code\n1 for Sales\n2 for Development\n3 Accounting \n0 for none\nEnter department code: ");
    Scanner in = new Scanner(System.in);
    int deptChoice = in.nextInt();
    in.close();  
    if (deptChoice == 1) {
      return "sales";
    }
    else if (deptChoice == 2) {
      return "Development";
    }
    else if (deptChoice ==3) {
      return "Accounting";
    }
    else {
      return "";
    }
  }
  // Generate a random password
  private String randPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMONPQRSTUVWXYZ";
    char[] password = new char[length];
    for (int i = 0; i<length; i++) {
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }
  // Set mailbox capacity
  public void setMailBoxCapacity(int capacity) {
    this.mailboxCapacity = capacity;

  }
  // Set alternate email
  public void setAlternateEmail(String altEmail) {
    this.alternateEmail = altEmail;
  }
  
  // Change password
  public void changePassword(String password) {
    this.password = password;
  }

  public int getMailBoxCapacity() { return mailboxCapacity; }
  public String getAlternateEmail() { return alternateEmail; }
  public String getPassword() { return password; }
}