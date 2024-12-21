public class Main {
    public static void main(String[] args) {
        System.out.println("(1)");
        User john = new User("John",1954,2,18);
        john.displayInfo();
        System.out.println();
        System.out.println("(2)");
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        System.out.println();
        System.out.println("(3)");
        nicolas.displayInfo(true);
        System.out.println();
        System.out.println("(4)");
        nicolas.displayInfo(false);
        System.out.println();

        //TODO
        System.out.println("(5)");
        User john2 = new User("John",1954,2,18);
        john2.displayInfo();
        john2.displayHappyBirthday();
        System.out.println();

        System.out.println("(6)");
        Admin nicolas2 = new Admin("Nicolas", 1964, 1, 7);
        nicolas2.displayInfo();
        nicolas2.displayHappyBirthday();
        System.out.println();

        System.out.println("(7 John's Birthday)");
        User john3 = new User("Jason",1954,12,21);
        john3.displayInfo();
        john3.displayHappyBirthday();
        System.out.println();

        System.out.println("(8 Nicolas's Birthday)");
        Admin nicolas3 = new Admin("Nicolas", 1964, 12, 21);
        nicolas3.displayInfo();
        nicolas3.displayHappyBirthday();

        System.out.println("(9 Nicolas's Birthday)");
        Admin nicolas4 = new Admin("Nicolas", 1964, 12, 21);
        nicolas4.displayInfo(true);
        nicolas4.displayHappyBirthday();
    }
}