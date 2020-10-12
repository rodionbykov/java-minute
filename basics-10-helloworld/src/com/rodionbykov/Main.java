package com.rodionbykov;


public class Main {

    public static void main(String[] args) {
        Double a = 2.5;
        Double b = 4.7;
        Double c = 4.7;
        Double p = a + b + c;
        Double hp = p / 2;

        Double s = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));

	// square of a triangle
        System.out.println(s);

        Boolean isHomeworkDone = true;
        Boolean isCleaningDone = true;

        Boolean canIPlayComputer = isHomeworkDone && isCleaningDone;

        Boolean isRaining = true;
        Boolean isSunShining = true;

        Boolean canIPlayOutdoors = !isRaining && isSunShining;

        Integer houseNuber = 27;

        String s1 = "fizz";
        String s2 = "buzz";
        String s3 = s1 + s2;

    }

}
