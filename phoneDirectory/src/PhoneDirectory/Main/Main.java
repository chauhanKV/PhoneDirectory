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

        System.out.println("Search Contact Information");
        System.out.println("Enter First Name : ");
        String searchFN = scan.nextLine();

        System.out.println("Enter Last Name : ");
        String searchLN = scan.nextLine();

        System.out.println("Enter personal mobile number : ");
        String searchPN = scan.nextLine();

        System.out.println("Enter work mobile number :");
        String searchWN = scan.nextLine();

        po.searchContact(Integer.parseInt(searchWN), Integer.parseInt(searchPN), searchFN, searchLN);


    }
}
