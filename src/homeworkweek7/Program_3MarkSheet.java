package homeworkweek7;

import java.util.Scanner;

// ensure all input marks are not out of permitted values
//if the values are in permitted range it will print result
//if the values are not in permitted range it will print error message
//calculate total,percentage and allocate pass,fail and grade

public class Program_3MarkSheet {
    static String name;
    static int roll, math, sci, eng;
    static int total;
    static double percentage;
    static String Grade;
    static String result;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Student Name: ");
        name = scanner.nextLine();
        System.out.println("Please enter Student Roll Number:");
        roll = scanner.nextInt();
        System.out.println("Please enter Math marks:");
        math = scanner.nextInt();
        System.out.println("Please enter Science Marks:");
        sci = scanner.nextInt();
        System.out.println("Please enter English Marks: ");
        eng = scanner.nextInt();
        if (math >= 0 && math <= 100 && sci >= 0 && sci <= 100 && eng >= 0 && eng <= 100) {
            result();
            print();

        } else {
            System.out.println("The marks value should be between 0 to 100");
        }
        scanner.close();
    }

    public static void result() {
        total = math + eng + sci;
        percentage = (total / 3);
        if ((math < 35) || (sci < 35) || (eng < 35)) {
            percentage = 0.0;
            result = "Fail";
            Grade = "N/A";
        } else if ((percentage >= 35) && percentage < 50) {
            result = "Pass";
            Grade = "C";
        } else if ((percentage >= 50) && percentage < 60) {
            result = "Pass";
            Grade = "B";
        } else if ((percentage >= 60) && percentage < 80) {
            result = "Pass";
            Grade = "A";
        } else if ((percentage >= 80)) {
            result = "Pass";
            Grade = "A++";
        }
    }
    public static void print(){
        System.out.println("|               Mark Sheet                   |");
        System.out.println("|   Name        :"            + name +"      |");
        System.out.println("|   Roll No     :"            + roll +"      |");
        System.out.println("|____________________________________________|");
        System.out.println("|  Subjects     :              Marks         |");
        System.out.println("|  Maths        :              " +math +"        |");
        System.out.println("|  Science      :              "+sci + "        |");
        System.out.println("|  English      :              "+eng +"         |");
        System.out.println("|____________________________________________|");
        System.out.println("|   Total       :              "+total +"       |");
        System.out.println("|____________________________________________|");
        System.out.println("|   Percentage  :              "+percentage +"  |");
        System.out.println("|   Result      :              "+result +"      |");
        System.out.println("|   Grade       :              "+ Grade +"      |");
        System.out.println("|____________________________________________|");


    }

}