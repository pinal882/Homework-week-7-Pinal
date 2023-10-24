package homeworkweek7;

import java.util.Scanner;

public class Program_12NumberAlphabetOrSymbol {
    //to check input value is number or an alphabet or symbol.


    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        ch=scanner.next().charAt(0);
        scanner.close();

       if ((ch>='A' && ch<='Z') || (ch>='a' && ch <= 'z')){
           System.out.println(" It is a character");
       } else if (ch >='0' && ch<= '9') {
            System.out.println("It is Digit");
       } else {
            System.out.println("It is a Special Character");
             }
              }

        }


