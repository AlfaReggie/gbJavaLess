//Задан целочисленный список ArrayList.
//Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

package less_3;

import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        List<Integer> numbersList = createList();
        System.out.println("List numbers -> " + numbersList);
        resultF(numbersList);
    }

    static List<Integer> createList() {
        Scanner iScanner = new Scanner(System.in);
        String[] nameParam = new String[] {"size", "min", "max"};
        Integer[] valParam  = new Integer[3];
        for (int i = 0; i < nameParam.length; i++) {
            System.out.print("Enter " + nameParam[i] + ": ");
            valParam[i] = iScanner.nextInt();
        }
        List<Integer> list = fillList(valParam[0], valParam[1], valParam[2]);
        return list;
    }

    static List<Integer> fillList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static void resultF(List<Integer> list) {
        double result = 0;
        for (Integer nxtNum : list) {
            result += nxtNum;
        }
        System.out.println("Max element list: " + Collections.max(list) + "\n" +
                           "Max element list: " + Collections.min(list) + "\n" +
                           "Average: " + result/list.size());
    }

}
