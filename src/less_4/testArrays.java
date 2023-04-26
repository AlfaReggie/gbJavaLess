//Реализуйте очередь с помощью Array со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

package less_4;


public class testArrays {

    Integer[] enqueue(Integer arr[], int elem) {

        int size = arr.length;
        if (size == arr.length){
            Integer[] arr2 = new Integer[arr.length + 1];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size] = elem;
        return arr;
    }

    Integer[] dequeue(Integer arr[]) {
        System.out.println(arr[0]);
        Integer[] arr2 = new Integer[arr.length - 1];
        System.arraycopy(arr, 1, arr2, 0, arr2.length);

        return arr2;
    }

    void first(Integer arr[]) {
        System.out.println(arr[0]);
    }
}

