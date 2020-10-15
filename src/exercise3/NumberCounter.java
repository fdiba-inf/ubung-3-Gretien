package exercise3;

import java.util.Scanner;

public class NumberCounter{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    int number = input.nextInt();
    int positive = 0;
    int negative = 0;
    while (number != 0){
      count++;
      sum = sum + number;
      if(number > 0){
        positive
        System.out.println("Positive numbers: "+ positive);

      } else {
        negative
        System.out.println("Negative numbers: " + negative);
      }
      System.out.println("Sum:" + sum);
      int average = number / count;
      System.out.println("Average:" + average);
      

    }

  }
}