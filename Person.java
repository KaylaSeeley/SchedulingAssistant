public class Person {
    private String firstName;
    private String lastName;
    private int ID;
    private int phoneNumber;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.ID = 0;
        this.phoneNumber = 1111111111;
    }

    public Person(String firstName, String lastName, int ID, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.phoneNumber = phoneNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
