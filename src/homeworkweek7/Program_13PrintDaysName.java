package homeworkweek7;

import java.util.Scanner;

public class Program_13PrintDaysName {
    //input any numbers between, 1 to 7
    //print the days name
    // if number is out of selection - "Week contains 1 to 7 days"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of days =");
        int num = scanner.nextInt();
        scanner.close();
        switch (num)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;

                case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }

    }
}
