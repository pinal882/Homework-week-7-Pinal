package homeworkweek7;

public class Program_20SpecificValueArray {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int specific = 70;
        if (containsValue(numbers, specific)) {
            System.out.println("The array contains the value" + specific);
        } else {
            System.out.println("The array does not contain the value" + specific);
        }

    }

    public static boolean containsValue(int[] array, int specific) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == specific) {
                return true;
            }
        }
        return false;
    }

}





