package less_4;

import java.util.Arrays;

    public class task_4 {
        public static void main(String[] args) {
            testArr();
        }

        static void testArr() {
            Integer arr[] = new Integer[] {1, 2, 3, 4, 5};
            testArrays TA = new testArrays();
            arr = TA.enqueue(arr, 6);
            System.out.println("Array after update -> " + Arrays.toString(arr));
            arr = TA.dequeue(arr);
            System.out.println("Array before dequeue: -> " + Arrays.toString(arr));
            TA.first(arr);
        }

}
