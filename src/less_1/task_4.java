//Реализовать простой калькулятор (введите первое число, введите второе число,
// введите требуемую операцию, ответ)

package less_1;
import java.util.Scanner;

public class task_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        Scanner iScanner = new Scanner(System.in);
        while (flag) {
            String userQuest;
            System.out.printf("\nEnter 's' for start or 'q' for exit from program: ");
            userQuest = iScanner.next();
            if (userQuest.equals("s")) {
                int number_1 = 0;
                int number_2 = 0;
                int[] numArr = new int[] {number_1, number_2};
                for (int j = 0; j < numArr.length; j++) {
                    numArr[j] = getInt(j);
                }
                String operation = getOperation();
                int result = calc(numArr[0], numArr[1], operation);
                System.out.println("Operation result: " + numArr[0] + operation
                                                    + numArr[1] + "=" + result);
            } else if (userQuest.equals("q")) {
                flag = false;
            } else {
                System.err.println("Not find command!");
            }
        }
    }

    static int getInt(int idx) {
        System.out.println("Enter " + (idx + 1) + " number: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error, try again: ");
            num = getInt(idx);
        }
        return num;
    }

    static String getOperation() {
        System.out.println("Enter math operation symbol:");
        String operation = scanner.next();
        if (operation.equals("+") | operation.equals("-") |
                operation.equals("/") | operation.equals("*")) {
            return operation;
        } else {
            System.out.println("Error enter math operation, try again! ");
            return getOperation();
        }
    }

    static int calc(int num1, int num2, String operation) {
        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else if (operation.equals("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }
}

/*
public class task_4 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner iScanner = new Scanner(System.in);
        while (flag) {
            String userQuest;
            System.out.printf("\nEnter 's' for start or 'q' for exit from program: ");
            userQuest = iScanner.next();
            if (userQuest.equals("s")) {
                System.err.println("Result: " + resFunc());
            } else if (userQuest.equals("q")) {
                flag = false;
            } else {
                System.err.println("Not find command!");
            }
        }
    }

    static int checkNum(String numb) {
        int number = 0;
        try {
            number = Integer.valueOf(numb);
        } catch (NumberFormatException e) {
            System.err.println("Error!");
        }
        return number;
    }

    static int calc(int num1, int num2, String operation){

        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else if (operation.equals("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }
    static int resFunc() {
        Scanner iScanner = new Scanner(System.in);
        int number_1 = 0; int number_2 = 0;
        int[] numArr = new int[] {number_1, number_2};
        for (int j = 0; j < numArr.length; j++) {
            System.out.print("Enter " + (j + 1) + " number: ");
            String userNum = iScanner.next();
            numArr[j] = checkNum(userNum);
        }
        int res = 0;
        System.out.print("Enter symbol math operation: ");
        String operation = iScanner.next();
        if (operation.equals("+") | operation.equals("-") |
                operation.equals("/") | operation.equals("*")) {
            res = calc(numArr[0], numArr[1], operation);
        } else {
            System.out.print("Error enter operation");
        }
        return res;
    }
}
*/