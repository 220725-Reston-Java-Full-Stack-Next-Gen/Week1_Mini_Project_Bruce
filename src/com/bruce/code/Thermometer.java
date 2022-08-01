package com.bruce.code;

import java.util.Arrays;

public class Thermometer {
    private int degreesF;
    private int degreesC;
    private String name;
    private int[] tempReadings = new int[3];

    public Thermometer() {
    }

    public Thermometer(int degreesF, int degreesC, String name, int[] tempReadings) {
        this.degreesF = degreesF;
        this.degreesC = degreesC;
        this.name = name;
        this.tempReadings = tempReadings;
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "degreesF=" + degreesF +
                ", degreesC=" + degreesC +
                ", name='" + name + '\'' +
                ", tempReadings=" + Arrays.toString(tempReadings) +
                '}';
    }

    public static int convertToFahrenheit(int c){
        return (int) (c*1.8+32);
    }
    public static int convertToCelsius(int f){
        return (int)((f-32)*.5556);
    }
    public static void calculateAvgTemp(int[] tempReadings){
        int avg=0;
        for(int i = 0; i < 3; i++){
            avg += tempReadings[i];
        }
        avg = avg/3;

        System.out.println("The average temp is: "+ avg );
    }



    public int getDegreesF() {
        return degreesF;
    }

    public void setDegreesF(int degreesF) {
        this.degreesF = degreesF;
    }

    public int getDegreesC() {
        return degreesC;
    }

    public void setDegreesC(int degreesC) {
        this.degreesC = degreesC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getTempReadings() {
        return tempReadings;
    }

    public void setTempReadings(int[] tempReadings) {
        this.tempReadings = tempReadings;
    }
}
