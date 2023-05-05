package less_5;

import java.util.*;

public class EmployList {

    Map<Integer, ArrayList<String>> tMap = new TreeMap<>(Collections.reverseOrder());
    private ArrayList<String> names = new ArrayList<>();

    void add(ArrayList<String> fullNameList) {
        for (int i = 0; i < fullNameList.size() - 1; i++) {
            ArrayList<String> nxtName = new ArrayList<>(Arrays.asList(fullNameList.get(i).split(" ")));
            names.add(nxtName.get(0));
        }
    }

    void addEmploy() {
        for (String firstName : names) {
            int counter = 0;
            for (String temp : names) {
                String spam = temp;
                if (firstName.equals(spam)) {
                    counter++;
                }
            }
            if (tMap.containsKey(counter)) {
                ArrayList<String> names = tMap.get(counter);
                if (!names.contains(firstName)) {
                    names.add(firstName);
                }
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(firstName);
                tMap.put(counter, temp);
            }
        }
    }

    String print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, ArrayList<String>> element : tMap.entrySet()){
            for (String name : element.getValue()) {
                stringBuilder.append(name).append(", ");
            }
            int startIndex = stringBuilder.length() - 2;
            int stopIndex = stringBuilder.length();
            stringBuilder.replace(startIndex, stopIndex, String.format(" - %d repead\n", element.getKey()));
        }
        return stringBuilder.toString();
    }
}