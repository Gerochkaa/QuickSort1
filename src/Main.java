
    import java.util.Arrays;
import java.util.Random;

    public class Main {

        public static int[] generateRandomArray(int size) {
            int[] arr = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(100); // Generate random integers between 0 and 99
            }
            return arr;
        }


        public static int[] generateAscendingArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i + 1;
            }
            return arr;
        }


        public static int[] generateDescendingArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = size - i;
            }
            return arr;
        }

        public static void main(String[] args) {

            int[] randomArray = generateRandomArray(50);
            int[] ascendingArray = generateAscendingArray(50);
            int[] descendingArray = generateDescendingArray(50);

            
            System.out.println("Random Array: " + Arrays.toString(randomArray));
            System.out.println("Ascending Array: " + Arrays.toString(ascendingArray));
            System.out.println("Descending Array: " + Arrays.toString(descendingArray));
        }
    }
