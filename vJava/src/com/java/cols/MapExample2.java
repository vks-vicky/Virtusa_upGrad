package com.java.cols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("Ansh", "Rao");
        map.put("Atul", "Singh");
        map.put("Ankit", "Parihar");
        map.put("Avanish", "Kumar");
        map.put("Abhishek", "Pandey");

        Scanner sc = new Scanner(System.in);

        String user, pwd, res;
        System.out.println("Enter your username and password: ");
        user = sc.next();
        pwd = sc.next();
        res = map.getOrDefault(user, "Invalid Password...");
        if(res.equals(pwd)){
            System.out.println("Correct Credentials...");
        } else {
            System.out.println("Incorrect Credentials...");
        }

    }
}
