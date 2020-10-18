package exercise3;

import java.util.Scanner;

public class PrimeNumber { 
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    boolean isPrime = true;
    int i = 2;
    while(i < n) {
      if(n%i ==0){
        isPrime = false;
        break;
      }
      i++;
    }System.out.println("Prime number: " + isPrime);
    
        
    
     

    
  }
}