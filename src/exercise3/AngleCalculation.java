package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        char type = input.next().charAt(0);
        do{
          if(type == 'd'){
            double radiant = value * (Math.PI/180);
            System.out.println("Angle: " + radiant + "r");
          }else if(type == 'r'){
            double degree = value * (180/Math.PI);
            System.out.println("Angle: " + degree + "d");
          }
          value = input.nextDouble();
          type = input.next().charAt(0);
        }while(type == 'r' || type == 'd');
        
    }
}