//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//Работу сдать как обычно ссылкой на гит репозиторий
//P.S. Частые ошибки смотри в конце семинара

package prepFinTask.src;
import com.sun.source.tree.ArrayAccessTree;

import java.awt.geom.RoundRectangle2D;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("MSI Titan GT77", "Intel Core i9", 128,
                "GeForce RTX 3080", 17.3, 3072, "Windows",
                "black", "plastic", 344.0);
        Notebook notebook2 = new Notebook("ASUS ROG Strix G15", "AMD Ryzen 7", 64,
                "GeForce RTX 3050", 15.6, 512,
                "Windows", "black", "plastic", 117.0);
        Notebook notebook3 = new Notebook("ASUS ROG Strix SCAR G733ZW", "Intel Core i9", 64,
                "GeForce RTX 3070", 17.3, 2048, "Windows",
                "black", "plastic", 225.0);
        Notebook notebook4 = new Notebook("MSI Katana GF76", "Intel Core i5", 64,
                "GeForce RTX 3070", 17.3, 512, "Windows",
                "red", "plastic", 159.0);
        Notebook notebook5 = new Notebook("MSI GL66", "Intel Core i5", 32,
                "GeForce RTX 3060", 15.6, 512, "Windows",
                "grey", "plastic", 168.0);
        Notebook notebook6 = new Notebook("Acer Nitro 5", "Intel Core i7", 16,
                "GeForce RTX 3070", 15.6, 1024, "Linux",
                "red", "plastic", 165.0);
        Notebook notebook7 = new Notebook("Lenovo Legion 7", "AMD Ryzen 7", 32,
                "GeForce RTX 3080", 16.0, 1024, "Windows",
                "grey", "plastic", 239.0);
        Notebook notebook8 = new Notebook("Acer Predator Triton 700", "Intel Core i7", 64,
                "GeForce RTX 1080", 15.6, 1024, "Windows",
                "black", "plastic", 226.0);
        Notebook notebook9 = new Notebook("Acer Predator 17", "Intel Core i9", 32,
                "GeForce GTX980M", 17.3, 1024, "Linux",
                "grey", "plastic", 165.0);
        Notebook notebook10 = new Notebook("ASUS ROG Strix G15", "AMD Ryzen 7", 64,
                "GeForce RTX 3050", 15.6, 512, "Windows",
                "black", "plastic", 117.0);
        Notebook notebook11 = new Notebook("Acer Predator Helios 500", "Intel Core i7", 64,
                "GeForce RTX 1070", 17.3, 2048, "Linux",
                "red", "plastic", 161.0);
        Notebook notebook12 = new Notebook("Apple MacBook Pro 13 M2", "Apple M2", 16,
                "Apple M2", 13.3, 1024, "MacOS",
                "grey", "metal", 117.0);
        Notebook notebook13 = new Notebook("Apple MacBook Air 13 M2", "Apple M2", 24,
                "Apple M2", 13.6, 2048, "MacOS",
                "grey", "metal", 274.0);
        Notebook notebook14 = new Notebook("Apple MacBook Pro 14 M2 Pro", "Apple M2 Pro", 32,
                "Apple M2 Pro", 14.2, 512, "MacOS",
                "grey", "metal", 117.0);
        Notebook notebook15 = new Notebook("Apple MacBook Pro 13 M2", "Apple M2", 16,
                "Apple M2", 13.3, 1024, "MacOS",
                "grey", "metal", 117.0);
        Notebook notebook16 = new Notebook("Apple MacBook Pro 13 M2", "Apple M2", 16,
                "Apple M2", 13.3, 1024, "MacOS",
                "grey", "metal", 117.0);
        Notebook notebook17 = new Notebook("test", "Intel Core i7", 16,
                "test", 16.1, 1024, "MacOS",
                "grey", "metal", 117.0);

        ArrayList<Notebook> nbooks = new ArrayList<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6, notebook7,
                notebook8, notebook9, notebook10, notebook11, notebook12, notebook13, notebook14, notebook15, notebook16, notebook17));

        HashSet<Notebook> notebooks = new HashSet<>();

        for (int i = 1; i < nbooks.size(); i++) {
            if (i == 1) {
                notebooks.add(nbooks.get(i));
            } else {
                boolean flag_add = true;
                for (int j = 1; j < i; j++) {
                    if(nbooks.get(j).equals(nbooks.get(i))) {
                        flag_add = false;
                    }
                }
                if (flag_add) {
                    notebooks.add(nbooks.get(i));
                }
            }
        }

        HashSet<Notebook> good_nbook = new HashSet<>();

        HashMap<Integer, Object> search_param = search_params();

        for (Notebook nbook: notebooks) {
            boolean flag = true;
            for (Map.Entry<Integer, Object> key: search_param.entrySet()) {
                if (key.getKey() <= 5) {
                    if (!(nbook.list_stringMetods().get(key.getKey() - 1).equals(key.getValue()))) {
                        flag = false;
                    }
                } else if (key.getKey() <= 7) {
                    if (!(nbook.list_intMetods().get(key.getKey() - nbook.list_stringMetods().size() - 1) >
                            Integer.parseInt(key.getValue().toString()))) {
                        flag = false;
                    }
                } else if (key.getKey() < 9){
                    if (!(nbook.list_floatMetods().get(key.getKey() - nbook.list_stringMetods().size()
                            - nbook.list_intMetods().size() - 1) > Double.parseDouble(key.getValue().toString()))) {
                        flag = false;
                    }
                }
            }
            if (flag == true) {
                good_nbook.add(nbook);
            }
        }
        for (Notebook good_notebook: good_nbook) {
            System.out.println(good_notebook);
        }
    }

    public static HashMap<Integer, Object> search_params() {

        Notebook notebook = new Notebook("test", "Intel Core i7", 16,
                "test", 16.1, 1024, "MacOS",
                "grey", "metal", 117.0);

        String[][] params_value_str = {{"Intel Core i9", "Intel Core i7", "AMD Ryzen 7", "Intel Core i5", "Apple M2", "Apple M2 Pro"},
                {"GeForce RTX 1080", "GeForce RTX 3050", "GeForce RTX 3060", "GeForce RTX 3070",
                        "GeForce RTX 3080", "GeForce GTX980M", "Apple M2", "Apple M2 Pro"}, {"Windows", "MacOS", "Linus"}, {"black", "grey", "red"}, {"plastic", "metal"}};
        Integer[][] params_value_int = {{16, 24, 32, 64, 128}, {512, 1024, 2048, 3072}};

        Double[][] params_value_double = {{13.3, 14.2, 13.6, 15.6, 16.0, 17.3}};
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Object> search_param = new HashMap<>();

        while (true) {
            for (int i = 1; i < notebook.name_param.size() - 1; i++) {
                System.out.println(i + ": " + notebook.name_param.get(i));
            }
            System.out.println("Enter number param or 0 for exit: ");
            int choise_param = scanner.nextInt();
            if (choise_param == 0) {
                break;
            }

            if (choise_param <= 5) {
                for (int idx1 = 0; idx1 < params_value_str[choise_param - 1].length; idx1++) {
                    System.out.println(idx1 + 1 + ": " + params_value_str[choise_param - 1][idx1]);
                }
                System.out.println("Enter number " + notebook.name_param.get(choise_param) + ": ");
                int choise_value = scanner.nextInt();

                search_param.put(choise_param, params_value_str[choise_param - 1][choise_value - 1]);

            } else if (choise_param < 8) {
                for (int idx2 = 0; idx2 < params_value_int[choise_param - params_value_str.length - 1].length; idx2++) {
                    System.out.println(idx2 + 1 + ": " + params_value_int[choise_param - params_value_str.length - 1][idx2]);
                }
                System.out.println("Enter number " + notebook.name_param.get(choise_param) + ": ");
                int choise_value = scanner.nextInt();

                search_param.put(choise_param, params_value_int[choise_param - params_value_str.length - 1]
                        [choise_value - 1]);
            } else if (choise_param < 9) {
                for (int idx3 = 0; idx3 < params_value_double[choise_param - params_value_str.length - params_value_int.length - 1].length; idx3++) {
                    System.out.println(idx3 + 1 + ": " + params_value_double[choise_param - params_value_str.length - params_value_int.length - 1][idx3]);
                }
                System.out.println("Enter number " + notebook.name_param.get(choise_param) + ": ");
                int choise_value = scanner.nextInt();

                search_param.put(choise_param, params_value_double[choise_param - params_value_str.length - params_value_int.length - 1]
                        [choise_value - 1]);
            }
        }
        return search_param;
    }
}