package homeworkweek7;

import java.util.Scanner;

public class Program_2LeapYear {
    //input any year and find out if it is leap year or not
    // ex.2007

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Year");
        int year = scanner.nextInt();

        if((year%4==0) || (year%400==0) && (year%100!=0)){
            System.out.println(year+ "is a leap year");
        }else{
            System.out.println(year+ "is not a leap year");
        }
  scanner.close();
    }



}
