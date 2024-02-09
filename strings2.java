/*
Description

Write a Java program that: Creates a String that refers to Most guitars have six strings. Using relevant String methods:
1. Print the length of the String on a new line.
2. Print the position of the first occurrence of the character 'h' on a new line.
3. Print to the screen the String in all lower case characters on a new line.
4. Print to the screen the String in all upper case characters on a new line.

For practice save the length and position in integer variables and the strings in new string variables. Then print these variables instead.

Output Format (this is the not correct output)

String Length: 7
Position of first 'h': 3
mostly ...
MOSTLY 

*/

public class strings2 
{
    public static void main(String[] args) 
    {
        String guitars = new String("Most guitars have six strings.");

        // 1
        int guitarsLength = guitars.length();
        System.out.println("String Length: " + guitarsLength);

        // 2
        int charH = guitars.indexOf('h');
        System.out.println("Position of first 'h' : " + charH );

        // 3
        String guitarsLowerCase = new String(guitars.toLowerCase());
        System.out.println(guitarsLowerCase);

        // 4 
        String guitarsUpperCase = new String(guitars.toUpperCase());
        System.out.println(guitarsUpperCase);
    }
}
