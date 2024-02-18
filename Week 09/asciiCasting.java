/*

Write a Java program that prints all of the letters from a to z to the screen using a for loop, and prints the letters from z back to a using a while loop.
This questions makes use of "casting" an integer to a char, and the ascii values for letters. You can find this information by googling "Ascii table". If unsure, ask a demonstrator.

Sample output

a b c d e f g h i j k l m n o p q r s t u v w x y z 
z y x w v u t s r q p o n m l k j i h g f e d c b a 

*/

public class asciiCasting 
{
    public static void main(String[] args) 
    {
        int num = 122;
        
        for(int i = 97; i < 123; i++)
        {
            char temp = (char)i;
            System.out.print(temp + " ");
        }

        System.out.println();

        while(num > 96)
        {
            char temp = (char)num;
            System.out.print(temp + " ");
            num--; 
        }
    }
}
