package loopsInJava;

import java.util.Scanner;

public class Part3 {
  public static void main(String[] args) {
    /* 1. Menu-Driven Calculator */
    Scanner sc = new Scanner(System.in);
    executionLoop:
    do {
      /* Main menu */
      System.out.print(
      "\n*****CALCULATOR*****\n" +
      "Please select an operation:\n" +
      "1. Addition\n" +
      "2. Subtraction\n" +
      "3. Multiplication\n" +
      "4. Division\n" +
      "5. Exit\n" +
      "\n" +
      "Enter your choice: \n");
      int operation = sc.nextInt(); // User input
      if (operation!=5) {
        System.out.print("\nEnter the first number: \n");
        int num1 = sc.nextInt();
        System.out.print("\nEnter the second number: \n");
        int num2 = sc.nextInt();
        int result;
        String operator;
        switch (operation) {
          case 1:
            operator = "+";
            result = num1 + num2;
            break;
          case 2:
            operator = "-";
            result = num1 - num2;
            break;
          case 3:
            operator = "*";
            result = num1 * num2;
            break;
          case 4:
            operator = "/";
            result = num1 / num2;
            break;
          default:
            System.out.println("Please enter a valid choice.");
            continue executionLoop;
        }//switch
        System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);
      }//if
      else {
        System.out.println("\nExiting the calculator. Thank you!\n");
        break executionLoop;
      }
    } while (true); //do-while - executionLoop
    
    
  }
}
