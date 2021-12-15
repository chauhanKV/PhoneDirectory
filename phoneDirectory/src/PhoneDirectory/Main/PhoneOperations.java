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
        // Remove node in LinkedList
    }

    public void editContact()
    {
        // Update node in LinkedList
    }

    public void searchContact(int workNumber, int personalNumber, String firstName, String lastName)
    {
        // CHECK for EFFICIENT WAY
        // First work on search contact to get contact info and then delete or edit
        Contact searchNode = new Contact(personalNumber, workNumber, firstName, lastName);
        ArrayList<Contact> list = search(searchNode);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("####### Your search result is below #######");

            Contact contact = (Contact) list.get(i);
            System.out.println("Name : " + contact.FirstName() + ' ' + contact.LastName());
            System.out.println("Personal Number : " + contact.PersonalNumber());
            System.out.println("Work Number : " + contact.WorkNumber());
        }


    }

    private ArrayList<Contact> search(Contact searchContact)
    {
        ArrayList<Contact> list = contactList.searchNode(searchContact);
        return list;
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
