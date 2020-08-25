package me.chbshoot.ch3;

public class MyFirstClass {
    public static void main(String[] args) {
        String make = "Hyundai";
        String model = "Elantra";
        double engineSize = 2.0;
        int revolutionsPerMin;
        byte gear = 4;
        short speed;


        speed = (short)(gear * 20)
        revolutionsPerMin = speed * gear;
        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);
        System.out.println("The speed of the car is " + speed);
        System.out.println("The RPM is " + revolutionsPerMin);
    }
}