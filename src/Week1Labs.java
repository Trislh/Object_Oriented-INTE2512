import java.util.Scanner;

public class Week1Labs {
    // Question 1
    static void doOrder(int num1, int num2, int num3) {
        int temp;

        if (num1 > num2) {
            temp = num1; // Temp store num1 value
            num1 = num2; // num1 take value of num2
            num2 = temp; // num2 take value of temp
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print(num1 + " " + num2 + " " + num3);
    }
    // Question 2
    static void checkInt(int num) {
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println(num + " is divisible by both 5 and 6");
        } else if (num % 5 == 0 || num % 6 == 0) {
            System.out.println(num + " is divisible by 5 or 6, but not both");
        } else {
            System.out.println(num + " is not divisible by either 5 or 6");
        }
    }
    // Question 3
    static double square(double num)
    {
        return num * num;
    }
    static void check2Circle(double x1, double y1, double rad1 , double x2, double y2, double rad2)
    {
        double distance;
        double sum = rad1 + rad2;
        // Find the distance
        double sq = square(x1 - x2) + square(y1 - y2);
        distance = (Math.sqrt(sq));
        // Find the position of circles
        // distance <= |rad1 - rad2| --> inside
        if (distance <= Math.abs(rad1 - rad2))
        {
            System.out.println("Circle 2 is inside Circle 1");
        }
        // distance <= rad1 + rad2 --> overlaps
        else if (distance <= sum)
        {
            System.out.println("Circle 2 is overlaps Circle 1");
        }

    }
    // Question 4
    static void displayTable()
    {
        /*
        print for the title
        a print row for miles + kilometers of both table, from left to right
        loop outside to repeat the column
        */
        double kilo = 1.609;
        int j = 20;

        System.out.println("Miles\t" + "Kilometers\t" + "|\t" + "Kilometers\t" + "Miles\t");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i + "\t\t" + kilo * i + "\t\t|\t" + j + "\t\t\t" + j / kilo);
            j += 5;
        }
    }
    // Question 5

    public static void main(String[] args) {
        int num1, num2, num3, num;
        int choice;
        double x1,y1,rad1,x2,y2,rad2;

        Scanner input = new Scanner(System.in);
        System.out.print("Which question do you want to run: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Num 1: ");
                num1 = input.nextInt();
                System.out.print("Num 2: ");
                num2 = input.nextInt();
                System.out.print("Num 3: ");
                num3 = input.nextInt();
                doOrder(num1, num2, num3);
                break;
            case 2:
                System.out.print("Enter number you want to check: ");
                num = input.nextInt();
                checkInt(num);
                break;
            case 3:
                System.out.print("Circle 1 - X: ");
                x1 = input.nextDouble();
                System.out.print("Circle 1 - Y: ");
                y1 = input.nextDouble();
                System.out.print("Circle 1 - Radius: ");
                rad1 = input.nextDouble();

                System.out.print("Circle 2 - X: ");
                x2 = input.nextDouble();
                System.out.print("Circle 2 - Y: ");
                y2 = input.nextDouble();
                System.out.print("Circle 2 - Radius: ");
                rad2 = input.nextDouble();

                check2Circle(x1, y1, rad1, x2, y2, rad2);
            case 4:
                displayTable();
        }
    }






}
