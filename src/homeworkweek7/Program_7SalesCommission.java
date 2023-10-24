package homeworkweek7;

import java.util.Scanner;

public class Program_7SalesCommission {

    //find sales commision based on sales

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input sales id");
        int x = scanner.nextInt();
        System.out.println("seller's name");
        String b = scanner.next();
        System.out.println("sales amount");
        int y = scanner.nextInt();
        System.out.println("basic salary");
        int z = scanner.nextInt();
scanner.close();

        if (y>=50000){
            System.out.println("Commission is: "  + (y*0.35));
        }else if (y>=30000){
            System.out.println("Commission is : " + (y*0.20));
        }else if (y>=20000){
            System.out.println("Commission is : "  + (y*0.10));
        }else if (y>=10000){
            System.out.println("Commission is : "  + (y*0.05));
        }else if (y<10000) {
            System.out.println("Commission is : " + (y * 0.02));
        }
    }
}
