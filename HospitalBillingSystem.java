import javax.print.Doc;
//importing required API
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;
import java.io.BufferedWriter;


public class HospitalBillingSystem {

    public static void main(String[] args) {
        //taking users input
        Scanner input=new Scanner(System.in);

        char choice='y';
        // validation loop. Makes sure the user wants to continue to run this program
        while(choice=='y')
        {
            startProgram(); // this function starts the actual program
            System.out.println();
            System.out.println();
            System.out.print("Would you like to start this program? ");

            choice=input.next().charAt(0);
        }

        System.out.println("End of Program");




    }


    public static void startProgram()
    {


        //the next 30 lines or so is simply taking users input and creating an object for the info
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Patient's ID: ");
        int ID=input.nextInt();
        System.out.print("Enter patient's first name: ");
        String name1=input.next();
        System.out.print("Enter patient's last name: ");
        String name2=input.next();
        System.out.print("Enter patient's Date Of Birth (day/month/year): ");
        String dateOfBirth=input.next();
        Date DateOfBirth=new Date(dateOfBirth);
        System.out.println();
        System.out.print("Enter Doctors first name: ");
        String string3=input.next();
        System.out.print("Enter Doctor's Last name: ");
        String string1=input.next();
        System.out.print("Enter Doctor's specialty: ");
        String string2=input.next();
        System.out.println();
        Doctor doctor1=new Doctor(string3,string1,string2);
        System.out.print("Enter Admit Date (day/month/year): ");
        string3=input.next();
        Date dateAdmitted= new Date(string3);
        System.out.print("Enter Discharged Date (day/month/year): ");
        string1=input.next();
        Date dateDischarged= new Date(string1);
        System.out.print("Enter Enter pharmacy Charges, room Rent, and doctor Fee: ");
        double pharmC=input.nextDouble();
        double roomRent=input.nextDouble();
        double doctorFee=input.nextDouble();
        Bill bill1=new Bill(pharmC,roomRent,doctorFee);
        System.out.println();
        Patient patient1= new Patient(name1,name2,ID,doctor1,DateOfBirth,dateAdmitted,dateDischarged,bill1);

        // this function prints the users information and also prints them to a file
        printInfo(patient1);

    }
    public static void printInfo(Patient p1)
    {
        //printing information
        System.out.println();
        System.out.println("Patent's name:      "+p1.toString());
        System.out.println("ID:                 "+p1.getID());
        System.out.println("Patient's birthday: "+p1.getDateOfBirth());
        System.out.println();
        System.out.println("Attending Physician: "+p1.getDoctor1().toString());
        System.out.println("Admit date:         "+p1.getDateAdmitted().toString());
        System.out.println("Discharge date:     "+p1.getDateReleased().toString());
        System.out.println();
        System.out.println("Pharmacy Charges:   "+p1.getBill().getPharmacyCharge());
        System.out.println("Room Charges:       "+p1.getBill().getRoomRent());
        System.out.println("Doctor's Fee:       "+p1.getBill().getDoctorFee());
        double total=p1.getBill().getPharmacyCharge()+p1.getBill().getRoomRent()+p1.getBill().getDoctorFee();
        System.out.println("===========================");
        System.out.println("Total:              "+total);



       //creates a file to be written on
        String name=  p1.getFirstName()+p1.getLastName()+".txt";

        try {
          File myFile=new File(name);
            if (myFile.createNewFile()) {
                ;
                //System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //writing information to the file
        try {
            FileWriter writer = new FileWriter(p1.getFirstName()+p1.getLastName()+".txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);



            bufferedWriter.write("Patent's name:      "+p1.toString());
            bufferedWriter.newLine();
            bufferedWriter.write("ID: "+p1.getID());
            bufferedWriter.newLine();
            bufferedWriter.write("Patient's birthday: "+p1.getDateOfBirth());
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("Attending Physican: "+p1.getDoctor1().toString());
            bufferedWriter.newLine();
            bufferedWriter.write("Admit date:         "+p1.getDateAdmitted().toString());
            bufferedWriter.newLine();
            bufferedWriter.write("Discharge date:     "+p1.getDateReleased().toString());
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("Pharmacy Charges:   "+p1.getBill().getPharmacyCharge());
            bufferedWriter.newLine();
            bufferedWriter.write("Room Charges:       "+p1.getBill().getRoomRent());
            bufferedWriter.newLine();
            bufferedWriter.write("Doctor's Fee:        "+p1.getBill().getDoctorFee());
            bufferedWriter.newLine();

            bufferedWriter.write("=======================");
            bufferedWriter.newLine();
            bufferedWriter.write("Total:               "+total);


            bufferedWriter.close(); //closes file
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
