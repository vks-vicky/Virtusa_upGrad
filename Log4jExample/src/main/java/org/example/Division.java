package org.example;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

  public static Logger logger = Logger.getLogger(Division.class);

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      int a, b, c;
      a = sc.nextInt();
      b = sc.nextInt();
      c = a / b;
      System.out.println("Divison " + c);
      logger.info("Performing Divison of 2 numbers program...");
    } catch(ArithmeticException e) {
      System.err.println("Division By Zero Impossible... ");
      logger.error("Division By Zero Impossible... Error occurred.");
    } catch(InputMismatchException e) {
      System.err.println("Please enter a valid Integer... ");
      logger.error("Please enter a valid Integer... Error occurred.");
    } catch(Exception e){
      throw new RuntimeException(e);
    }
  }
}
