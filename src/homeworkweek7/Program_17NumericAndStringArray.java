package homeworkweek7;

import java.util.Arrays;

public class Program_17NumericAndStringArray {
    // sort numeric array and string array

    int a[];
    String names[];

    public static void main(String[] args) {
        int a[] = {327,468, 1078, 1435, 50};
        String names[] = {"Prime","Java","Python","programming","C++"};
        System.out.println("original numeric array : "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+ Arrays.toString(a));
        System.out.println("original string array : "+ Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted string array :" + Arrays.toString(names));

    }
}