//Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//что 1 человек может иметь несколько телефонов.

package less_5;

import java.util.ArrayList;

public class task_1 {
    public static void main(String[] args) {
        PhoneBook newBook = new PhoneBook();

        newBook.addNumber("Petrov", "13246");
        newBook.addNumber("Korovev", "79851468");
        newBook.addNumber("Petrov", "454123");
        newBook.addNumber("Kukushkin", "4188845");
        System.out.println(newBook.print());
        System.out.println(newBook.searchByName("Petrov"));
        System.out.println(newBook.searchByNumb("7985468"));
    }
}
