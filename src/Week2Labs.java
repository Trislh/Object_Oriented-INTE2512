import java.util.Scanner;

public class Week2Labs {

    static Scanner input = new Scanner(System.in);
    // Question 1
    static void displayNumDaysInMonth() {
        // Variable
        String[] month30Days = {"Apr","Jun","Sep","Nov"};
        String[] month31Days = {"Jan","Mar","May","July","Aug","Oct","Dec"};
        int i = 0;
        // Take input
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        // Check Month in Array
        while (true) {
            if (month30Days[i].contains(month)) {
                System.out.println(month + " " + year + " has 30 days");
                break;
            }
            if (month31Days[i].contains(month)) {
                System.out.println(month + " " + year + " has 31 days");
                break;
            }
            if (month.equals("Feb")) {
                if (year % 400 == 0 && year % 100 == 0 || year % 4 == 0 && year % 100 != 0) {
                    System.out.println(month + " " + year + " has 29 days");
                }
                else {
                    System.out.println(month + " " + year + " has 28 days");
                }
                break;
            }
        }

    }

    public static void main(String[] args) {
        int choice;
        System.out.print("Which question would you want to run? ");
        choice = input.nextInt();
        if (choice == 1) {
            displayNumDaysInMonth();
        }
    }


}
