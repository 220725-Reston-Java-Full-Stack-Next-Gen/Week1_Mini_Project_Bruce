package com.bruce.code;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please name your thermometer: ");
        String name = s.nextLine();
        System.out.println("Hi user, thanks for using \"" + name + "\" today!");
        System.out.println("Enter a Fahrenheit value:");
        int f = s.nextInt();
        System.out.println("Enter a Celsius value:");
        int c = s.nextInt();
        Thermometer a = new Thermometer();
        a.setDegreesC(c);
        a.setDegreesF(f);
        System.out.println("----------------------------------------");
        System.out.println("Conversion for Fahrenheit -> Celsius: " + Thermometer.convertToCelsius(a.getDegreesF()));
        System.out.println("Conversion for Celsius -> Fahrenheit: " + Thermometer.convertToFahrenheit(a.getDegreesC()));
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Enter three integer values that represent recent temperature readings");
        int[] tempReadings = new int[3];
        for(int i = 0; i < 3; i++){
            tempReadings[i]= s.nextInt();
        }
        a.setTempReadings(tempReadings);
        System.out.println("----------------------------------------");
        Thermometer.calculateAvgTemp(a.getTempReadings());
        System.out.println("----------------------------------------");
        System.out.println("goodbye.");
    }
}
