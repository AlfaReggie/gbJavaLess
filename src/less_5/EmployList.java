package less_5;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class EmployList {
    Map<String, Integer> tMap = new TreeMap<>();

    void addEmploy(ArrayList<String> employNameList) {
        for (int i = 0; i < employNameList.size() - 1; i++) {
            if (tMap.containsKey(employNameList.get(i))) {
                tMap.put(employNameList.get(i), tMap.get(employNameList.get(i)) + 1);
            } else {
                tMap.put(employNameList.get(i), 1);
            }
        }
    }

    String print(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : tMap.entrySet()) {
            stringBuilder.append(entry.getKey())
                         .append(": repead ")
                         .append(entry.getValue())
                         .append(" count \n");

        }
        return stringBuilder.toString();
    }
}