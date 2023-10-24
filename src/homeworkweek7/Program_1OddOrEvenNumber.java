package homeworkweek7;

import java.util.Scanner;

public class Program_1OddOrEvenNumber {
    // find out if input number is odd or even
    // using ternary operator

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number");
       int number = scanner.nextInt();
       String result = (number % 2 == 0) ? "Even" : "odd";//ternary operator
            System.out.println("number is : "+result );
            scanner.close();
        }
    }






