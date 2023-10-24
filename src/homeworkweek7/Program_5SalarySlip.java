package homeworkweek7;

import java.util.Scanner;

public class Program_5SalarySlip {
    static int empId,basic;
    static String name;
    static float hra,ta,da,pf,gross;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Employee ID");
        empId = scanner.nextInt();
        System.out.println("Please enter Employee Name");
        name = scanner.next();
        System.out.println("Please enter Basic Salary");
        basic = scanner.nextInt();
        calculation();
        scanner.close();
    }
    public static void calculation(){
            hra =(basic*10)/100;
            da = (basic*8)/100;
            ta = (basic*9)/100;
            pf=(basic*20)/100;
            gross=((basic+hra+da+ta) - pf);
            System.out.println("|____________________________|");
            System.out.println("|         SALARY SLIP        |");
            System.out.println("|____________________________|");
            System.out.println("|Employee id   :"+ empId     );
            System.out.println("|Employee Name :" + name     );
            System.out.println("|_____________________________");
            System.out.println("|Basic Salary  :" +  basic   );
            System.out.println("| HRA 10%      :" + hra      );
            System.out.println("| TA 8%        :" + ta       );
            System.out.println("| DA 9%        :" + da       );
            System.out.println("| PF -20&      :" + pf       );
            System.out.println("| ___________________________|");
           System.out.println("| Gross Salary :" +gross      );
            System.out.println("|============================|");

        }
    }



