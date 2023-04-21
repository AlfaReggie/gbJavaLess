package less_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_3 {
    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
        bubbleSort(mas);
    }


    static void bubbleSort(int[] arrNum) {

        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("loger3.txt");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.log(Level.INFO, Arrays.toString(arrNum));
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrNum.length-1; i++) {
                if(arrNum[i] > arrNum[i+1]){
                    isSorted = false;
                    buf = arrNum[i];
                    arrNum[i] = arrNum[i+1];
                    arrNum[i+1] = buf;
                }
            }
            logger.log(Level.INFO, Arrays.toString(arrNum));
        }

        System.out.println(Arrays.toString(arrNum));
    }
}

