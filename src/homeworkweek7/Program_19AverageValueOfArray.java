package homeworkweek7;

public class Program_19AverageValueOfArray {

    public static void main(String[] args) {

        int[] a = new int[]{20, 30, 25, 35, 60,-16,-60};
        int sum = 0;
        int i;
        for (i = 0; i < a.length; i++)
        sum = sum + a[i];
        double average = sum / a.length;
        System.out.println(" Average value of the array is : " + average);
    }
}