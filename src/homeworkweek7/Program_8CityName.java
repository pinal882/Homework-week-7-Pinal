package homeworkweek7;

import java.util.Scanner;

public class Program_8CityName {
    // input any alphabet from A TO F and print their city name accordingly
    // any other alphabet should be  invalid entry
static char i;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any letters of the alphabet from A TO F Uppercase only");
        i=scanner.next().charAt(0);
        scanner.close();
        Program_8CityName obj  = new Program_8CityName();
       obj.city();
       scanner.close();
    }
public void city(){
    if (i =='A'){
        System.out.println("Ahmedabad");
    }else if (i=='B'){
        System.out.println("Bhopal");
    }else if (i=='C'){
        System.out.println("Chandigarh");
    }else if (i=='D'){
        System.out.println("Delhi");
    }else if (i=='E'){
        System.out.println("East Delhi");
    }else if (i=='F'){
        System.out.println("Faridabad");
    }else {
        System.out.println("invalid character entry");
    }

}



    }


