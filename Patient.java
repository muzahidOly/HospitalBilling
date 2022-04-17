public class Patient extends Person{
    //variable
    private int ID;
    private Doctor doctor1;
    private Date dateOfBirth;
    private Date dateAdmitted;
    private Date dateReleased;
    private Bill bill;

    //variable setter and getter
    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Doctor getDoctor1() {
        return doctor1;
    }

    public void setDoctor1(Doctor doctor1) {
        this.doctor1 = doctor1;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateAdmitted() {
        return dateAdmitted;
    }

    public void setDateAdmitted(Date dateAdmitted) {
        this.dateAdmitted = dateAdmitted;
    }

    public Date getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(Date dateReleased) {
        this.dateReleased = dateReleased;
    }


    //constructor
    public Patient(String firstName, String lastName,int ID) {
        super(firstName, lastName);
        setID(ID);
    }
    //constructor
    public Patient(String firstName, String lastName, int ID, Doctor doctor1, Date dateOfBirth, Date dateAdmitted, Date dateReleased,Bill bill) {
        super(firstName, lastName);
        this.ID = ID;
        this.doctor1 = doctor1;
        this.dateOfBirth = dateOfBirth;
        this.dateAdmitted = dateAdmitted;
        this.dateReleased = dateReleased;
        this.bill=bill;
    }
    //constructor
    public Patient() {
        super("", "");
    }

    //overrides the toString method
    @Override
    public String toString()
    {
        return getFirstName()+" "+getLastName();
    }
}
