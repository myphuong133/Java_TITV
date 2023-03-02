package Java65_cau_truc_Map;

import java.util.*;

public class Dictionary {
    private Map<String, String> data = new TreeMap<String,String>();



    public void addWord(String english, String vietnam){
        this.data.put(english, vietnam);
    }

    public void deleteThisWord(String english){
        this.data.remove(english);
    }

    public String translateEngToVn(String key){
        return this.data.get(key);
    }

    public void displayKey(){
        Set<String> keyList = this.data.keySet();
        System.out.println(Arrays.toString(keyList.toArray()));
    }

    public int takeSize(){
        return this.data.size();
    }

    public void deleteAll(){
        this.data.clear();
    }

    public boolean checkKey(String w){
        return this.data.containsKey(w);
    }

    public boolean checkValue(String w){
        return this.data.containsValue(w);
    }

    public void displayValue(){
        data.entrySet().forEach(entry -> {
            System.out.println("" + entry.getValue());
        });

    }

}
