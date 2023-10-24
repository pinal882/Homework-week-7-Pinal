package homeworkweek7;

import java.util.Scanner;

public class Program_9SwitchStatement {

    static char i;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any character from A TO F(Uppercase Only)");
        i = scanner.next().charAt(0);
        scanner.close();

        switch (i) {
                case 'A':
                    System.out.println("Ahmedabad");
                    break;
                case 'B':
                    System.out.println("Bhopal");
                    break;
                case 'C':
                    System.out.println("Chandigarh");
                    break;
                case 'D':
                    System.out.println("Delhi");
                    break;
                case 'E':
                    System.out.println("East Delhi");
                    break;
                case 'F':
                    System.out.println("Faridabad");
                    break;
                default:
                    System.out.println("invalid Character Entry");

            }
        }

    }

