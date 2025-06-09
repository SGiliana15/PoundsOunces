package org.example;

public class Converter {
  
  public static String toPounds(double ounces){
    double num = ounces / 16;
    if (num == 1.0000){
      return String.format("%.4f lb", num);
    }
    return String.format("%.4f lbs", num);
  }

  public static String toPoundsAndOunces(double ounces){
    double lbs = ounces / 16;
    int lb = (int)lbs;
    double oz = ounces % 16;
    if (lb != 1){
    return (int)lbs + " lbs " + (int)oz + " oz";
  }
  else return (int)lbs + " lb " + (int)oz + " oz";

}
}

