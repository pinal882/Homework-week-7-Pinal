package homeworkweek7;

import java.util.Scanner;

public class Program_16PositiveOrNegativeOrZeroNumber {
    //check if number is Positive,negative or zero

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        number=scanner.nextInt();
        if (number> 0) {
            System.out.println("Positive");
        } else if (number< 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        scanner.close();
        }
    }


