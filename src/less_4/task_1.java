//Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
//который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

package less_4;

import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(15, 78, 89, 9, 12, 12546, 8, 879, 16, 54, 1));
        LinkedList<Integer> ll2 = new LinkedList<>();
        ListIterator<Integer> iterator = ll.listIterator(ll.size());
        while (iterator.hasPrevious()){
            ll2.add(iterator.previous());
        }
        System.out.println(ll2);
    }
}
