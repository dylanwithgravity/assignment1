// Task c
enum Gender {
    M, F
}


public class Person {
    // instance properties
    private String firstName;
    private String lastName;
    private Gender gender;
    // Task b
    private String phoneNumber;

    // default constructor
    public Person() {
    }
    // Task b
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // Taskb
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // parameterized constructor, updated: Task b
    public Person(String firstName, String lastName, Gender gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        // Task C
        switch (gender) {
            case M:
                this.gender = gender;
                break;
            case F:
                this.gender = gender;
                break;
        }

        this.gender = gender;
    }

    // Task b
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
