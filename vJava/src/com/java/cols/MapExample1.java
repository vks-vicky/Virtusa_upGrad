package com.java.cols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Aman");
        map.put(2,"Ansh");
        map.put(3,"Peter Parker");
        map.put(3,"Raj");
        map.put(4,"Vivek");

        int key;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        key = sc.nextInt();
        result = map.getOrDefault(key, "Not Found...");
        System.out.println(result);
    }
}
