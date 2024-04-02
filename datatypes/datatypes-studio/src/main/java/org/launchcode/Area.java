package org.launchcode;

import java.util.Scanner;

public class Area {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();
        double area = Circle.getArea(radius);
//        double area = (radius * radius) * Math.PI;
        System.out.println("The area of the circle is: " + area + ".");
    }

}