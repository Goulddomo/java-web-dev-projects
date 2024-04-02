package org.launchcode;

import java.util.Scanner;

import static java.lang.Float.isNaN;

public class Area {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();
        double area = Circle.getArea(radius);
//        double area = (radius * radius) * Math.PI;
        System.out.println("The area of the circle is: " + area + ".");
//in
//
//        if (radius.isNaN) {
//
//            // the "then" clause: ask to submit a correct int
//        }
//    }


    }
}