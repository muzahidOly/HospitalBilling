public class Doctor extends Person {
    //variable
private String specialty;
    //constructor
    public Doctor() {
        super("","");
    }
    //constructor
    public Doctor(String firstName, String lastName, String specialty) {
        super(firstName, lastName);
        setSpecialty(specialty);

    }
    //variable setter and getter
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    //overrides the toString method
    @Override
    public String toString()
    {
        return getFirstName()+" "+getLastName()+" "+getSpecialty();
    }


}
