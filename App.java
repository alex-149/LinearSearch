
public class App {
    public static void main(String[] args) throws Exception {

        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        int index = linearSearch(array, 6);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
