//Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

package less_1;

public class task_3 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (checkSimple(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean checkSimple(int nxtNum) {
        if (nxtNum <= 1) {
            return false;
        } else if (nxtNum <= 3) {
            return true;
        } else if (nxtNum % 2 == 0 || nxtNum % 3 == 0) {
            return false;
        }

        int n = 5;

        while (n * n <= nxtNum) {
            if (nxtNum % n == 0 || nxtNum % (n + 2) == 0) {
                return false;
            }
            n = n + 6;
        }
        return true;
    }
}
