/*

Area of a Rectangle

Write a Java program that takes in two Double inputs, representing the length and width of a rectangle. Calculate and print out the area of this rectangle.

Sample input

2.4
1.7

Sample output

4.08

*/

import java.util.Scanner;

public class rectangle 
{
    public static void main(String[] args) 
    {
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        length = sc.nextDouble();

        System.out.println("Enter the width: ");
        width = sc.nextDouble();

        area = length * width;

        System.out.println(area);


    }
}
