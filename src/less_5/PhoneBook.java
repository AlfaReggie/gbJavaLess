package less_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, ArrayList<String>> phoneBook = new HashMap();

    void addNumber(String name, String number){
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(number);
            phoneBook.put(name, list);
        }
    }
    String searchByName(String name) {
        StringBuilder res = new StringBuilder();
        if (phoneBook.containsKey(name)) {
            for (int i = 0; i < phoneBook.get(name).size(); i++) {
                res.append(name + ": " + phoneBook.get(name).get(i) + "\n");
            }
        } else{
            res.append("Not found contact!");
        }
        return res.toString();
    }

    String searchByNumb(String number){
        for (Map.Entry<String, ArrayList<String>> entry: phoneBook.entrySet()){
            if (entry.getValue().contains(number)){
                return entry.getKey() + " number: " + number + "\n";
            }
        }
        return  "Not found number\n";
    }

    String print(){
        return phoneBook.toString();
    }
}
