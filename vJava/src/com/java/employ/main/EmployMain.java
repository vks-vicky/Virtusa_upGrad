package com.java.employ.main;

import com.java.employ.bal.EmployBal;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;
import com.java.employ.model.Gender;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class EmployMain {

    static EmployBal employBal;
    static {
        employBal = new EmployBal();
    }

    public static void showEmployMain(){
        List<Employ> employList = employBal.showEmployBal();
        employList.forEach(x -> {
                System.out.println(x);
        });
    }

    public static void addEmployMain() throws EmployException {
        Scanner sc = new Scanner(System.in);
        Employ employ = new Employ();

        System.out.println("Enter Employ ID:   ");
        employ.setEmploy_id(sc.nextInt());
        System.out.println("Enter Employ Name:   ");
        employ.setName(sc.next());
        System.out.println("Enter Gender (MALE/FEMALE):   ");
        employ.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter Employ Basic Salary:   ");
        employ.setBasic(sc.nextDouble());
        System.out.println("Enter Employ Department:    ");
        employ.setDept(sc.next());
        System.out.println("Enter Employ Designation:    ");
        employ.setDesig(sc.next());

        System.out.println(employBal.addEmployBal(employ));
    }

    public static void searchEmployMain() {
        int employ_id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ ID: ");
        employ_id = sc.nextInt();
        Employ employ= employBal.searchEmployBal(employ_id);
        if(employ!=null){
            System.out.println(employ);
        } else {
            System.out.println("Employ Not Found");
        }
    }

    public static void removeEmployMain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ ID: ");
        int employ_id = sc.nextInt();
        System.out.println(employBal.removeEmployBal(employ_id));
    }

    public static void updateEmployMain() throws EmployException {
        Scanner sc = new Scanner(System.in);
        Employ employ = new Employ();
        System.out.println("Enter Employ ID: ");
        employ.setEmploy_id(sc.nextInt());
        System.out.println("Enter Employ Name:   ");
        employ.setName(sc.next());
        System.out.println("Enter Gender (MALE/FEMALE):   ");
        employ.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter Employ Basic Salary:   ");
        employ.setBasic(sc.nextDouble());
        System.out.println("Enter Employ Department:    ");
        employ.setDept(sc.next());
        System.out.println("Enter Employ Designation:    ");
        employ.setDesig(sc.next());
        System.out.println(employBal.updateEmployBal(employ));
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---O P T I O N S---");
            System.out.println("1. Add Employ");
            System.out.println("2. Show Employ");
            System.out.println("3. Search Employ");
            System.out.println("4. Delete Employ");
            System.out.println("5. Update Employ");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    try {
                        addEmployMain();
                    } catch (EmployException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2 :
                    showEmployMain();
                    break;
                case 3 :
                    searchEmployMain();
                    break;
                case 4 :
                    removeEmployMain();
                    break;
                case 5 :
                    try {
                        updateEmployMain();
                    } catch (EmployException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 6 :
                    System.exit(0);
            }
        }while(choice !=6);
    }
}
