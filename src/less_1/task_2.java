//Вычислить n! (произведение чисел от 1 до n)

package less_1;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int res;
            int num = checkNum();
            if (num == 0) {
                flag = false;
            }
            if (num < 0) {
                res = phactorial(num, false);
            } else {
                res = phactorial(num, true);
            }
            System.out.println("Phactorial your number: " + res);
        }
    }
    static int checkNum(){
        Scanner iScanner = new Scanner(System.in);
        boolean i = true;
        int number = 0;
        while (i) {
            System.out.printf("Enter number or zero for exit from program: ");
            String numb = iScanner.next();
            try {
                number = Integer.valueOf(numb);
                i = false;
            } catch (NumberFormatException e) {
                System.err.println("Error!");
            }
        }
        return number;
    }

    static int phactorial(int num, boolean positStep) {
        int res = 1;
        if (positStep) {
            for (int i = 2; i <= num; i++) {
                res *= i;
            }
        } else {
            for (int i = -1; i >= num; i--){
                res *= i;
            }
        }
        return res;
    }
}
