package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {

  @Test
  public void testSayHello(){
    Data data = new Data();
    assertEquals("Hello! Welcome to Junit testing...", data.sayHello());
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("Test case started...");
  }
  @AfterEach
  public void afterEach() {
    System.out.println("Test case ended...");
  }

  @BeforeAll
  public static void beforeAll() {
    System.out.println("Program Started... Welcome to Test cases...");
  }

  @AfterAll
  public static void afterAll() {
//    data = null;
    System.out.println("Program Ended...");
  }
}
