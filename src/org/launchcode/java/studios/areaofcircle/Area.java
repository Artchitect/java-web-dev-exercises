package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //prompted user for the radius of circle
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of the circle? ");
        //Data type chosen float and double
        float radius = input.nextFloat();
        double area;
        area = Circle.getArea((double) radius);
        System.out.println("The area of the circle: " + area);

    }
}
