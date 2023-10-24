package homeworkweek7;
public class Program_11NumbersDividedBy3And5 {
    //print numbers between, 1 to 100
    //numbers should be divided by 3 and 5 separately
    // i= 1<100



    public static void main(String[] args) {
//print numbers divided by 3
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++)
            if (i % 3 == 0) {
                System.out.println(i + ",");
            }
        //print numbers divided by 5
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++)
            if (i % 5 == 0) {
                System.out.println(i + ",");
            }

    }
}





