//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.

package less_1;
import java.util.LinkedList;
import java.util.List;

public class task_5 {
    public static void main(String[] args) {
        List<String> newList = new LinkedList<>();
        String a = new String("2? + ?5 = 69");
        System.out.println("Возвращаемое значение: ");
        for (String retval : a.split(" ", 5)) {
            newList.add(retval);
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; i <= 9; j++) {
                if ()
            }
        }
    }
}
