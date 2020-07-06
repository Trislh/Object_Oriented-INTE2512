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
        double sq = square(x2 - x1) + square(y2 - y1);
        distance = (Math.sqrt(sq));
        // Find the position of circles
        // distance <= |rad1 - rad2| --> inside
        if (distance <= Math.abs(rad2 - rad1))
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
            System.out.println(i + "\t\t" + kilo * i + "\t\t|\t" + j + "\t\t\t" + Math.round(j / kilo));
            j += 5;
        }
    }

    // Question 5
    static void displayNumber()
    {
        /*
        1st loop to display 1st line == 10 nums
        2nd big loop to display each row after the previous row is finished
        condition (num % 5 == 0 || num % 6 == 0) --> print
        else if (num % 5 == 0 && num % 6 == 0) --> ignore
         */
        long num = 100;
        int count = 0;
        while (num <= 200)
        {
            if (num % 5 == 0 || num % 6 == 0)
            {
                System.out.print(num + " ");
                count++;
            }
            if (count == 10)
            {
                System.out.println();
                count = 0;
            }
            num++;
        }
    }

    // Question 6
    static void doPyramid(int numLine)
    {
        int whiteSpace = numLine;

        for (int line = 1; line <= numLine; line++) {
            int num = 1;
            int reverseNum = line;

            for (int i = 0; i < whiteSpace; i++) {  // Print white space
                System.out.print("\t");
            }
            whiteSpace-=1;

            while (reverseNum > num) {  //numLine --> 1
                System.out.print(reverseNum + "\t");
                reverseNum--;
            }
            while (num <= line) {   // 1 --> numLine
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int num1, num2, num3, num;
        int choice;
        double x1, y1, rad1, x2, y2, rad2;
        int numLine;

        Scanner input = new Scanner(System.in);
        System.out.print("Which question do you want to run: ");
        choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter 3 numbers: ");
                num1 = input.nextInt();
                num2 = input.nextInt();
                num3 = input.nextInt();
                doOrder(num1, num2, num3);
            }
            case 2 -> {
                System.out.print("Enter number you want to check: ");
                num = input.nextInt();
                checkInt(num);
            }
            case 3 -> {
                System.out.print("Circle 1: X / Y / Radius: ");
                x1 = input.nextDouble();
                y1 = input.nextDouble();
                rad1 = input.nextDouble();
                System.out.print("Circle 2: X / Y / Radius: ");
                x2 = input.nextDouble();
                y2 = input.nextDouble();
                rad2 = input.nextDouble();
                check2Circle(x1, y1, rad1, x2, y2, rad2);
            }
            case 4 -> displayTable();
            case 5 -> displayNumber();
            case 6 -> {
                while (true) {
                    System.out.print("Enter the number of lines (1-15): ");
                    numLine = input.nextInt();
                    if (numLine < 1 || numLine > 15) {
                        System.out.println("The number of line is too low or high\n" +
                                           "Please try again between 1 and 15");
                    } else {
                        doPyramid(numLine);
                        break;
                    }
                }

            }
        }
    }
}
