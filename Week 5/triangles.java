/*
Triangles

Write a Java program that takes 3 doubles from the user. The program should then decide if these are the sides of a triangle and what type of triangle is. The doubles should be given as user input.
For a triangle to exist, (sideA + sideB) > sideC must hold for all three sides. A triangle is equilateral if all three sides are the same length, isosceles if two sides are the same length or 
scalene if all three sides are different.

Sample inputs

3.0
4.0
5.0

7.8
8.3
24.2

Sample outputs

This is a scalene triangle

This is not a triangle 

*/

import java.util.Scanner;

public class triangles 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        if(num1 + num2 < num3)
        {
            System.out.println("This is not a triangle");
        }
        else if(num1 == num2 && num1 == num3)
        {
            System.out.println("This is a equilateral triangle");
        }
        else if(num1 == num2 || num1 == num3 || num2 == num3)
        {
            System.out.println("This is an isosceles triangle");
        }
        else
        {
            System.out.println("This is a scalene triangle");
        }
    }
}
