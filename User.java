import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }
    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }
    // TODO
    public boolean isBirthday(){
        LocalDate today = LocalDate.now();
        int month = dob.getMonthValue();
        int day = dob.getDayOfMonth();
        return today.getMonthValue() == dob.getMonthValue() && today.getDayOfMonth() == dob.getDayOfMonth();
    }
    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }
    //
    public void displayInfo(){
        System.out.println("User Name: " + name);
        System.out.println("User DOB: " + dob);
    }
}
