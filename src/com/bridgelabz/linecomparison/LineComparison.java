package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of line XY");
        System.out.println("x1 coordinate");
        int x1 = sc.nextInt();
        System.out.println("y1 coordinate");
        int y1 = sc.nextInt();
        System.out.println("x2 coordinate");
        int x2 = sc.nextInt();
        System.out.println("y2 coordinate");
        int y2 = sc.nextInt();

        double lineLengthXY = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line XY is => " + lineLengthXY);

        System.out.println("Enter the value of line AB");
        System.out.println("x1 coordinate");
        int a1 = sc.nextInt();
        System.out.println("y1 coordinate");
        int b1 = sc.nextInt();
        System.out.println("x2 coordinate");
        int a2 = sc.nextInt();
        System.out.println("y2 coordinate");
        int b2 = sc.nextInt();

        double lineLengthAB = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

        if (lineLengthXY == lineLengthAB)
            System.out.println("Both lines are equal");
        else
            System.out.println("Both lines are not equal");
    }
}
