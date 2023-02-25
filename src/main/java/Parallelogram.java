//*******************************************************************************************************************************************************************************************************
// Parallelogram.java
//
// Calculates the height, area and lenght of the diagonal of a parallelogram.
//*******************************************************************************************************************************************************************************************************

import java.util.Scanner;
import java.lang.Math;

public class Parallelogram {
    public static void main(String[] args)
    {
        double x1,y1 , x2,y2 , x3,y3 , x4,y4 ;           							 // Coordinates of the parallelogram
        double height,lenght,area;
        double a , b ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the coordinates of the parallelogram: ");

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        x3 = scan.nextDouble();
        y3 = scan.nextDouble();

        x4 = scan.nextDouble();
        y4 = scan.nextDouble();

        height = y2 - y1;											// calculates height of the parallelogram
        area = height * (x4 - x1);										// calculates area of the parallelogram
        a = x3-x1;												// lenght of the diagonal on the x axis
        b = y3-y1;												// lenght of the diagonal on the y axis

        double c = Math.pow(a,2) + Math.pow(b,2);
        lenght = Math.sqrt(c);                                                                                  // finds c according to Pisagor Theorem a^2 + b^2 = c^2

        System.out.println("The height of the parallelogram is " + height);
        System.out.println("The area of the parallelogram is " + area);
        System.out.println("The lenght of the diagonal of the parallelogram is " + lenght);
    }
}
