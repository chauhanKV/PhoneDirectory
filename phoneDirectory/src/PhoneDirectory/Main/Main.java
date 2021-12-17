package PhoneDirectory.Main;

import org.w3c.dom.Text;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        showMenuOptions();
    }

    private static void showMenuOptions()
    {
        Scanner scan = new Scanner(System.in);
        boolean isStillInLoop = true;
        while(isStillInLoop)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Select the Operation you want to perform : ");
            System.out.println("");
            System.out.println("       1. Look up a Phone Number");
            System.out.println("       2. Add an entry to the Directory");
            System.out.println("       3. Delete an entry from the Directory");
            System.out.println("       4. Change someone's Phone Number");
            System.out.println("       5. Exit from this Program");
            System.out.println("");
            System.out.println("Enter the Number of your choice : ");
            String menuOption = scan.nextLine();

            switch(menuOption)
            {
                case "1":
                    search();
                    break;
                case "2":
                    addEntry();
                    break;
                case "3":
                    deleteEntry();
                    break;
                case "4":
                    editEntry();
                    break;
                case "5":
                    isStillInLoop = false;
                    break;
                default:
                    System.out.println("Wrong choice! Please try again.");
                    break;
            }
        }
    }

    private static void addEntry()
    {
        Scanner scan = new Scanner(System.in);
        PhoneOperations po = new PhoneOperations();
        boolean isInLoop = true;
        while(isInLoop)
        {
            System.out.println("Enter your First Name : ");
            String firstName = scan.nextLine();

            System.out.println("Enter your Last Name : ");
            String lastName = scan.nextLine();

            System.out.println("Enter your personal mobile number : ");
            String personalNumber = scan.nextLine();

            System.out.println("Enter your work mobile number : ");
            String workNumber = scan.nextLine();

            System.out.println("We are adding your contact in Directory.");
            Contact contactDetails = new Contact(Integer.parseInt(personalNumber), Integer.parseInt(workNumber), firstName, lastName);
            po.addContact(contactDetails);
            System.out.println("Your contact has been added successfully.");

            System.out.println("####### Your detailed contact information is below #######");
            System.out.println("Name : " + firstName + ' ' + lastName);
            System.out.println("Personal Number : " + personalNumber);
            System.out.println("Work Number : " + workNumber);

            System.out.println("Do you want to add another contact ? y/n");
            String addAnotherContact = scan.nextLine();

            isInLoop = addAnotherContact != "y" ? false : true;

        }
        showMenuOptions();
    }

    private static void search()
    {}

    private static void editEntry()
    {}

    private static void deleteEntry()
    {}
}
