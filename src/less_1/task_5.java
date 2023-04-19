//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.

package less_1;
import java.util.*;


public class task_5 {
    public static void main(String[] args) {
        List<String> newList = new LinkedList<String>();
        String a = new String("2? + ?5 = 69");
        for (String retval : a.split(" ", 5)) {
            newList.add(retval);
        }
        List<String> resList = new LinkedList<String>();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (Integer.valueOf(newList.get(0).replace("?", (String.valueOf(i)))) +
                        Integer.valueOf(newList.get(2).replace("?", (String.valueOf(j))))
                        == Integer.valueOf(newList.get(4))) {
                    System.out.println(newList.get(0).replace("?", (String.valueOf(i))) +
                            " + " + newList.get(2).replace("?", (String.valueOf(i))) + " = "
                            + newList.get(4));
                    ;
                }
            }
        }
    }
}
/*    static int Numb(String number, String resExpress) {
        int cntQuest = count(number, "?");
        if (cntQuest == 1) {
            for (int i = 0; i <= 9; i++) {
                return Integer.valueOf(number.replace("?", (String.valueOf(i))));
            }
        } else {
            for (int i = 0; i < Integer.valueOf(resExpress); i++) {
                return i;
            }
        }
        return 1;
    }

    static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    static int checkSum(List<String> expression) {
        int checkRes = 0;
        while (true) {
            int num1 = Numb(expression.get(0), expression.get(4));
            int num2 = Numb(expression.get(2), expression.get(4));
            checkRes = num1 + num2;
            if (num1 + num2 == Integer.valueOf(expression.get(4))) {
                break;
            }
            System.out.println(num1);
        }
        return checkRes;
    }
}
*/
