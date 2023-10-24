package homeworkweek7;


import java.util.Scanner;

public class Program_4NumberOfDaysInMonth {

   static int year;
    static int Month;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
        if (year >= 1 && year <= 9999) {
            isLeapYear(year);
            getDaysinMonth(Month, year);
        } else {
            System.out.println("false");

        }
        scanner.close();
    }
     public static void  isLeapYear(int year){
            if (year!= 0) {
                if (year % 400 == 0)
                    System.out.println("true");
               else if (year % 4 == 0)
                System.out.println("true");
                else if (year % 100 == 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }
        public static void getDaysinMonth(int Month,int year){
                Scanner scan = new Scanner(System.in);
                int days = 0;
                System.out.println("Please enter Month");
                Month = scan.nextInt();
                switch (Month){
                    case 1:
                        days = 31;
                        break;
                    case  2:
                        if ((year%4==0) || (year%400==0) && (year%100!=0)) {
                            days = 29;
                        }else {
                            days = 28;
                            break;
                        }
                    case 3:
                        days=31;
                        break;
                    case 4:
                        days=30;
                        break;
                    case 5:
                        days=31;
                        break;
                    case 6:
                        days=30;
                        break;
                    case 7:
                        days=31;
                        break;
                    case 8:
                        days=30;

                    case 9:
                        days=31;
                        break;
                    case 10:
                        days=30;
                        break;
                    case 11:
                        days=31;
                        break;
                    case 12:
                        days=30;
                    default:
                        days=-1;
                        }
                System.out.print(days);
                scan.close();
                }
            }











