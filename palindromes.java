/*

Description

Write a Java program that will determine if a String, called text, is a palindrome. A String is a palindrome if the word remains the same when spelled in reverse. For example: 

NAVAN is a palindrome
CAVAN is NOT a palindrome

Note: Please use "navan" as your first test String when evaluating. The program should work irrespective of case. Print all test Strings with Uppercase letters

Sample Output

NAVAN is a palindrome

Sample Output

CAVAN is NOT a palindrome 

*/

public class palindromes 
{
    public static void main(String[] args) 
    {
        String text = "navan";
        text = text.toUpperCase();
        String textReversed = "";

        for (int i = text.length()-1; i >= 0; i--)
        {
            char charAtI = text.charAt(i);
            textReversed = textReversed + charAtI;
        }

        if (text.equals(textReversed))
        {
            System.out.println(text + " is a palindrome");
        }
        else
        {
            System.out.println(text + " is NOT  a palindrome");
        }
    }
}
