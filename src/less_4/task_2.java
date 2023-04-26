//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

package less_4;

import java.util.Arrays;
import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        testLinkedList LL = new testLinkedList();
        LinkedList<Object> ll = new LinkedList<>();
        LL.enqueue(ll, 1);
        LL.enqueue(ll, 2);
        LL.enqueue(ll, 5);
        LL.enqueue(ll, 8);
        System.out.println(ll);
        LL.dequeue(ll);
        System.out.println(ll);
        LL.first(ll);
        System.out.println(ll);

    }

}
