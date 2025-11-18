package com.java.cols;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Ansh", "Rao");
        map.put("Atul", "Singh");
        map.put("Ankit", "Parihar");
        map.put("Avanish", "Kumar");
        map.put("Abhishek", "Pandey");

        System.out.println("HashMap Data is:");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
