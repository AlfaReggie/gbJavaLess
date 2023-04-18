//Вычислить n-ое треугольного число (сумма чисел от 1 до n)

package less_1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int res;
            int num = checkNum();
            if (num == 0) {
                flag = false;
            }
            if (num < 0) {
                res = sumTriang(num, false);
            } else {
                res = sumTriang(num, true);
            }
            System.out.println("Sum triangle digit: " + res);
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

    static int sumTriang(int num, boolean positStep) {
        int res = 0;
        if (positStep) {
            for (int i = 1; i <= num; i++) {
                res += i;
            }
        } else {
            for (int i = 1; i >= num; i--){
                res += i;
            }
        }
        return res;
    }
}