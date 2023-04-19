//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.

package less_1;
import java.util.*;


public class task_5 {
    public static void main(String[] args) {
        List<String> newList = new LinkedList<String>();
        String a = new String("?3 + 4? = 89");
        for (String retval : a.split(" ", 5)) {
            newList.add(retval);
        }
        System.out.println(newList.get(0));

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (Integer.valueOf(newList.get(0).replace("?", (String.valueOf(i)))) +
                        Integer.valueOf(newList.get(2).replace("?", (String.valueOf(j))))
                        == Integer.valueOf(newList.get(4))) {
                    System.out.println(newList.get(0).replace("?", (String.valueOf(i))) +
                            " + " + newList.get(2).replace("?", (String.valueOf(i))) + " = "
                            + newList.get(4));
                }
            }
        }
    }
}

