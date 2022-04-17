public class Bill {
    //constructor
    public Bill(String s) {
        String[] bill=s.split(" ");


        setPharmacyCharge(Double.parseDouble(bill[0]));
        setRoomRent(Double.parseDouble(bill[1]));
        setDoctorFee(Double.parseDouble(bill[2]));
    }
    //constructor
    public Bill(double pharmacyCharge, double roomRent, double doctorFee) {
        this.pharmacyCharge = pharmacyCharge;
        this.roomRent = roomRent;
        this.doctorFee = doctorFee;
    }
    //constructor
    public Bill(String pharmacyCharge, String roomRent, String doctorFee) {
        this.pharmacyCharge = Double.parseDouble(pharmacyCharge);
        this.roomRent = Double.parseDouble(roomRent);
        this.doctorFee = Double.parseDouble(doctorFee);
    }


    //variable setter and getter
    public double getPharmacyCharge() {
        return pharmacyCharge;
    }

    public void setPharmacyCharge(double pharmacyCharge) {
        this.pharmacyCharge = pharmacyCharge;
    }

    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    //variable
    private double pharmacyCharge;
    private double roomRent;
    private double doctorFee;
    //overrides the toString method
    @Override
    public String toString()
    {
        return getDoctorFee()+" "+getPharmacyCharge()+" "+getRoomRent();
    }
}
