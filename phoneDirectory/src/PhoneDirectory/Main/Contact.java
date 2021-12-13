package PhoneDirectory.Main;

public class Contact{
    private int personalNumber;
    private int workNumber;
    private String firstName;
    private String lastName;

    public Contact(int personalNumber, int workNumber, String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
        this.workNumber = workNumber;
    }

    public String FirstName() {return firstName;}
    public String LastName() {return lastName;}
    public int WorkNumber() {return workNumber;}
    public int PersonalNumber() {return personalNumber;}

}
