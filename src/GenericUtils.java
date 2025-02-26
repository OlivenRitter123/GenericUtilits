package src;

public class GenericUtils {
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        // Swap elements from both ends moving towards the center
        while (left < right) {
            // Swap the elements
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            // Move towards the center
            left++;
            right--;
        }
    }
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;  // Initialisiere die Summe als double
        for (T t : array) {
            sum += t.doubleValue();  // Konvertiere jedes Element zu double und addiere es
        }
        return sum;
    }
}
