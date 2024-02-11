/*

Description

Write a Java program that will take a String and reverse it. To complete this question declare a String called reverse and assign it the value "programming". 
Your program should then reverse this string using a loop.

Sample Input

programming

Sample Output

gnimmargorp 

*/

public class reverseString 
{
    public static void main(String[] args) 
    {
        String reverse = "programming";
        String reversed = "";

        for (int i = reverse.length() -1; i >= 0; i--)
        {
            char charAtI = reverse.charAt(i);
            reversed = reversed + charAtI;
        }

        System.out.println(reversed);
    }
}
