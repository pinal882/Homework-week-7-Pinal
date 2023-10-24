package homeworkweek7;

import java.util.Scanner;

public class Program_6OddOrEvenNumber {
    // input any number and find out if its odd or even

    public static void main(String[] args) {
        int num ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        num = scanner.nextInt();
        if (num %2 == 0){
            System.out.println( num +  "is even");
        }else {
            System.out.println( num + "is odd");
        }
scanner.close();

    }
}
