package loopsInJava;

import java.util.Scanner;

public class Part2 {
  public static void main(String[] args) {
    /* 1. User Input */
    Scanner sc = new Scanner(System.in);
    executionLoop:
    while (true) { // Optional enhancement: continuous execution.
      System.out.println("\nPlease enter a positive integer or \"0\" to exit the program ");
      int num = sc.nextInt();
      if (num > 0) { // Optional enhancement: input validation
        /* 2. Sum the Digits */
        int tempNum = num;
        int sum = 0;
        summationLoop:
        while (tempNum > 0) {
          sum += tempNum;
          tempNum--;
        }//while - summationLoop
        /* 3. Output the Result */
        System.out.println("\nThe sum of every number from 1 to " + num + " is " + sum + ".");
      }//if
      else break executionLoop;
    }//while - executionLoop
  }//main()
}//Task2
