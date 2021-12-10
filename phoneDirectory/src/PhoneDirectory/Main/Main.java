package PhoneDirectory.Main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        PhoneOperations po = new PhoneOperations();
        System.out.println("Enter your First Name : ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();

        System.out.println("Enter your Last Name : ");
        String lastName = scan.nextLine();

        System.out.println("Enter your personal mobile number : ");
        String personalNumber = scan.nextLine();

        System.out.println("Enter your work mobile number :");
        String workNumber = scan.nextLine();

        System.out.println("####### Your detailed contact information is below #######");

        System.out.println("Name : " + firstName + ' ' + lastName);
        System.out.println("Personal Number : " + personalNumber);
        System.out.println("Work Number : " + workNumber);

        Contact contactDetails = new Contact(Integer.parseInt(personalNumber), Integer.parseInt(workNumber), firstName, lastName);
        po.addContact(contactDetails);
        System.out.println("Your contact has been added to the contact list");




    }
}
