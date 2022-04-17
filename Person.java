public class Person {
    //variable
    private String firstName;

    private String lastName;
    //constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //constructor
    public Person() {
        this.firstName="";
        this.lastName="";
    }
    //variable setter and getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //overrides the toString method
    @Override
    public String toString()
    {
        return getFirstName()+" "+getLastName();
    }
}
