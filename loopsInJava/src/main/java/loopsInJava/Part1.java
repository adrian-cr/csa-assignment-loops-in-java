package loopsInJava;

import java.util.Scanner;

public class Part1 {
  public static void main(String[] args) {
    /* 1. Print Numbers */
    System.out.println("Numbers from 1 to 10 printed to the console:");
    for (int i=1; i<=10; i++) {
      System.out.print(i + " ");
    }
    /* 2. Calculate Sum */
    int sum = 0;
    for (int i=1; i<=10; i++) {
      sum += i;
    }
    System.out.println("\n\nThe sum of all numbers from 1 to 10 is " + sum + ".\n");
    /* 3. Print Multiplication Table */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number from 1 to 10: ");
    int num = sc.nextInt();
    System.out.println("\n***** " + num + " TIMES TABLE *****");
    for (int i=0; i<=10; i++) {
      System.out.println(num + " * " + i + " = " + num*i);
    }
  }
}