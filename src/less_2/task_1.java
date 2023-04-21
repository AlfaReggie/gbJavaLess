//Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
//Используйте StringBuilder для подготовки ответа
//Исходная json строка это просто String !!! Для работы используйте методы String,
//такие, как replace, split, substring и т.д. по необходимости

package less_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_1 {
    public static void main(String[] args) {
        String jsonOBJ = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String a = JsonParser(jsonOBJ);
        saveToFile(a);
        System.out.println(a);
    }

    static void saveToFile(String jsonStr) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("loger.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        String pathW = "parser.txt";
        //String warnPath = "/d/dparser.txt";
        try (FileWriter fileWriter = new FileWriter(pathW, false)) {
            fileWriter.append(jsonStr);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        fileHandler.close();
    }


    static String[] prepareDate(String jsonObj) {
        String patternRep = "[()<\\s\"\\[\\]\\{\\}>]";
        //String replaceJSON = jsonObj.replaceAll(patternRep, "");
        String patternSplit = "\\s+|,|:\\s*";
        String[] wordsList = jsonObj.replaceAll(patternRep, "").split(patternSplit);
        return wordsList;
    }

    static String JsonParser(String jsonObj) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] wordsList = prepareDate(jsonObj);
        int cntStr = 0;
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i].equals("фамилия")) {
                stringBuilder.append("Студент/ка ");
            } else if (wordsList[i].equals("оценка")) {
                stringBuilder.append("получил/а ");
            } else if ((wordsList[i].equals("предмет"))) {
                stringBuilder.append("по предмету ");
            } else if (cntStr >= 5) {
                stringBuilder.append(wordsList[i] + " ");
                stringBuilder.append("\n");
                cntStr = 0;
            } else {
                stringBuilder.append(wordsList[i] + " ");
            }
            cntStr++;
        }
        return stringBuilder.toString();
    }
}

