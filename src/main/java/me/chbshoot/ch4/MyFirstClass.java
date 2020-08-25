package me.chbshoot.ch4;

public class MyFirstClass {
    public static void main(String[] args) {
        String make = "Hyundai";
        String model = "Elantra";
        String recSpeed = "";

        double engineSize = 2.0;
        int revolutionsPerMin;
        short speed;
        byte gear = 4;


        speed = (short)(gear * 20);
        revolutionsPerMin = speed * gear;
        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);
        System.out.println("The speed of the car is " + speed);
        System.out.println("The RPM is " + revolutionsPerMin);
        
        System.out.println("=======================================================================");
        System.out.println("===============    Part One   =========================================");
        System.out.println("=======================================================================");
        // (1) weak v. powerful
        System.out.println("This car is a " + (engineSize <= 1.3 ? "weak" : "powerful") 
            + " car because it has a size of " + engineSize);
        
        // (2) recommended speed by gear
        if (gear == 1) {
            recSpeed = "10";
        } else if (gear == 2) {
            recSpeed = "20";
        } else if (gear == 3) {
            recSpeed = "30";
        } else if (gear == 4) {
            recSpeed = "40";
        } else if (gear == 5) {
            recSpeed = "50";
        } else if (gear == 6) {
            recSpeed = "70";
        }

        System.out.println("The gear is " + gear + " so the speed should be over " + recSpeed);

        System.out.println("=======================================================================");
        System.out.println("===============    Part Two   =========================================");
        System.out.println("=======================================================================");
        // (3) loop thru 1900-2000
        int year;
        for (year = 1900; year <= 2000; year++)
            // leap?
            if (year % 4 == 0)
                System.out.println(year + " is a leap year!");

        // (4) loop thru 1900-2000, but break
        int ctr = 0;
        for (year = 1900; year <= 2000 && ctr < 5; year++) {
            // leap?
            if (year % 4 == 0)
            {
                System.out.println(year + " is a leap year!");
                ctr++;
            }
        }
        System.out.println("finished");

        System.out.println("=======================================================================");
        System.out.println("===============    Part Three    ======================================");
        System.out.println("=======================================================================");
        // (5) part 1 but with switch
        switch (gear) {
            case 1:
                recSpeed = "10";
            break;
            case 2:
                recSpeed = "20";
            break;
            case 3:
                recSpeed = "30";
            break;
            case 4:
                recSpeed = "40";
            break;
            case 5:
                recSpeed = "50";
            break;
            case 6:
                recSpeed = "60";
            break;
            case 7:
                recSpeed = "70";
            break;

            case 0:
            default:
                recSpeed = "nothing your speed should be....";
            break;
        }
        System.out.println("The gear is " + gear + " so the speed should be over " + recSpeed);

        System.out.println("=======================================================================");
        System.out.println("===============    Part Four (opt)    =================================");
        System.out.println("=======================================================================");
        // (6) array w/ 10 ints
        int[] myIntArray = new int[10];

        // (7) modify #4 so we store the first 10 instead of display first 5
        for (ctr = 0, year = 1900; year <= 2000 && ctr < 10; year++) {
            // leap?
            if (year % 4 == 0)
                myIntArray[ctr++] = year;
        }

        // (8) print out values in array using length
        int iter;
        for (iter = 0; iter < myIntArray.length; iter++) {
            System.out.println("[" + iter + "] " + myIntArray[iter]);
        }
    }
}