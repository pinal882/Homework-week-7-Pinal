package homeworkweek7;

import java.util.Scanner;

public class Program_10 {
    //input any two number
    // enter any symbol (+,-,/,*)
    //find addition,subtraction,multiplication and division according to their symbol


    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("enter choice of operator (+,_,*,/");
        ch=scanner.next().charAt(0);
        scanner.close();

        if (ch=='+') {
            System.out.println("\nAddition of" + num1 + "+" + num2 + "=" + (num1 + num2));
        }else  if(ch=='-'){
            System.out.println("Subtraction of"+num1+"-"+num2+"="+(num1-num2));
        }else if(ch=='*'){
            System.out.println("Multiplication of"+num1+"X"+num2+"="+(num1*num2));
        }else if (ch=='/'){
            System.out.println("Division of"+num1+"/"+num2+"="+(num1/num2));
        }

        }
    }


