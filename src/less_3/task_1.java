// Пусть дан произвольный список целых чисел, удалить из него четные числа

package less_3;

import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        resultFunc();
    }

    static void resultFunc() {
        Scanner iScanner = new Scanner(System.in);
        String[] nameParam = new String[] {"size", "min", "max"};
        Integer[] valParam  = new Integer[3];
        for (int i = 0; i < nameParam.length; i++) {
            System.out.print("Enter " + nameParam[i] + ": ");
            valParam[i] = iScanner.nextInt();
        }
        List<Integer> listBeforeDel = createList(valParam[0], valParam[1], valParam[2]);
        System.out.println("List before delete even numbers -> " + listBeforeDel);
        //List<Integer> listAfterDelEven = deleteEvenTest(listBeforeDel);
        //System.out.println(listAfterDelEven);
        deleteEven(listBeforeDel, valParam[0] - 1);
        System.out.println("List after delete even numbers -> " + listBeforeDel);
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    /*static List<Integer> deleteEvenTest(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                --i;
            }
        }
        return list;
    }*/

    static void deleteEven(List<Integer> list, int size) {
        if (size < 0) {
            return;
        } else {
            if (list.get(size) % 2 == 0) {
                list.remove(size);
            }
        }
        deleteEven(list, size - 1);
    }
}

