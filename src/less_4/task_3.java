//Найдите сумму всех элементов LinkedList,
//сохраняя все элементы в списке. Используйте итератор

package less_4;

import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        int sum = 0;
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(15, 78, 89, 9, 12, 12546, 8, 879, 16, 54, 1));
        LinkedList<Integer> ll2 = new LinkedList<>();
        ListIterator<Integer> iterator = ll.listIterator(ll.size());
        while (iterator.hasPrevious()){
            sum += addLL(ll2, iterator.previous());
        }
        System.out.println("The sum of all elements: " + sum);
        System.out.println("Saved list -> " + ll2);
    }

    static Integer addLL(LinkedList<Integer> ll, int nextEl) {
        ll.addFirst(nextEl);
        return nextEl;
    }
}
