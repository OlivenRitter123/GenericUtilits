package src;

public class GenericUtilsTest {
    public static void main(String[] args) {
        // Test reverse method
        System.out.println("Testing reverse method:");

        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Integer Array:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the Integer array
        GenericUtils.reverse(numbers);
        System.out.println("Reversed Integer Array:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] words = {"apple", "banana", "cherry"};
        System.out.println("\nOriginal String Array:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Reverse the String array
        GenericUtils.reverse(words);
        System.out.println("Reversed String Array:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Test sum method
        System.out.println("\nTesting sum method:");

        Integer[] integerArray = {1, 2, 3, 4, 5};
        double sum = GenericUtils.sum(integerArray);
        System.out.println("Sum of Integer Array: " + sum);

        Double[] doubleArray = {1.5, 2.5, 3.0};
        sum = GenericUtils.sum(doubleArray);
        System.out.println("Sum of Double Array: " + sum);

        // You can also try with Float or any other subclass of Number
        Float[] floatArray = {1.1f, 2.2f, 3.3f};
        sum = GenericUtils.sum(floatArray);
        System.out.println("Sum of Float Array: " + sum);
    }
}
