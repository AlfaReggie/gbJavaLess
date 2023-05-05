package less_4;

import java.util.LinkedList;
import java.util.Objects;

public class testLinkedList {
    //Реализуйте очередь с помощью LinkedList со следующими методами:
    //enqueue() - помещает элемент в конец очереди,
    //dequeue() - возвращает первый элемент из очереди и удаляет его,
    //first() - возвращает первый элемент из очереди, не удаляя.
    void enqueue(LinkedList<Object> ll, Object item) {
        ll.addLast(item);
    }

    void dequeue(LinkedList<Object> ll) {
        System.out.println(ll.get(0));
        ll.removeFirst();
    }

    Object first(LinkedList<Object> ll) {
        return ll.get(0);
    }
}
