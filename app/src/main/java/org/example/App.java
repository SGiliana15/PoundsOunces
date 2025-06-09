package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Ounce Conversion Program!\n");
    System.out.println("How many ounces do you have?");
    Scanner input = new Scanner(System.in);
    double ounces = input.nextDouble();
    System.out.println("Thank you! Converting ounces to pounds.\n");
    String pounds = Converter.toPounds(ounces);

    if (ounces == 16){
      System.out.print("16 oz is equivalent to 1 lb");
    }
    else {
    System.out.println((int)ounces + " oz is equivalent to " + pounds); 
    if (ounces % 16 != 0){ 
    String result = Converter.toPoundsAndOunces(ounces);
    System.out.println("or " + result);
    }
  }
  System.out.print("\nThank you for using the OCP!");
    input.close();
  }
}
