//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.

package less_1;
import java.util.*;


public class task_5 {
    public static void main(String[] args) {
        List<String> newList = new LinkedList<String>();
        String a = new String("2? + ?2 = 69");
        for (String retval : a.split(" ", 5)) {
            newList.add(retval);
        }
        checkSum(newList);
    }

    static int Numb(String number, String resExpress, int i) {
        int cntQuest = count(number, "?");
        int nxtNum = 0;
        if (cntQuest == 1) {
            nxtNum = Integer.valueOf(number.replace("?", (String.valueOf(i))));
        }
        return nxtNum;
    }

    static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    static void checkSum(List<String> expression) {
        int checkRes = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++){
                if (Numb(expression.get(0), expression.get(4), i) + Numb(expression.get(2), expression.get(4), j)
                        == Integer.valueOf(expression.get(4))) {
                    num1 = Numb(expression.get(0), expression.get(4), i);
                    num2 = Numb(expression.get(2), expression.get(4), j);
                    checkRes = num1 + num2;
                }
            }
        }
        if (checkRes != 0) {
            System.out.println(num1 + " + " + num2 + " = " + checkRes);
        } else {
            System.out.println("Not decisions!");
        }
    }
}

/*
for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (Integer.valueOf(newList.get(0).replace("?", (String.valueOf(i)))) +
                        Integer.valueOf(newList.get(2).replace("?", (String.valueOf(j))))
                        == Integer.valueOf(newList.get(4))) {
                    System.out.println(newList.get(0).replace("?", (String.valueOf(i))) +
                            " + " + newList.get(2).replace("?", (String.valueOf(i))) + " = "
                            + newList.get(4));
                    break;
                }
*/
