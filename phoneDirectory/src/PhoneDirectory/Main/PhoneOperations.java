package PhoneDirectory.Main;
import PhoneDirectory.LinkedList.*;

import java.util.ArrayList;

public class PhoneOperations {

    private LinkedList contactList = new LinkedList<Contact>();

    public void addContact(Contact contactDetails)
    {
       contactList.addFirst(contactDetails);
    }

    public void deleteContact()
    {

    }

    public void editContact()
    {

    }

    public void searchContact()
    {

    }

    public void showContactList() {
        ArrayList<Contact> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            System.out.println("####### Your detailed contact information is below #######");
//
//            System.out.println("Name : " +  + ' ' + lastName);
//            System.out.println("Personal Number : " + personalNumber);
//            System.out.println("Work Number : " + workNumber);
        }
    }
}
