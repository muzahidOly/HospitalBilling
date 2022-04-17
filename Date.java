public class Date {
    //variable
    private int day;
    private int month;
    private int year;
    //constructor
    public Date(String date) {

        String[] paths = date.split("/");
        setDay(Integer.parseInt(paths[0]));
        setMonth(Integer.parseInt(paths[1]));
        setYear( Integer.parseInt(paths[2]));
    }
    //variable setter and getter
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //overrides the toString method
    @Override
    public String toString()
    {
        return getDay()+"-"+getMonth()+"-"+getYear();
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
