/*
Description

Write a Java program that will:

1. Create a String that references Computer Science.
2. Create a String that references Education.
3. Use your knowledge of generating substrings to take Science from the first string and store it in a new String.
4. Use your knowledge of String concatenation to form a String Science Education from the newly created string and the second string. 5. Print the concatenated String to the screen.

Note: Do not print out Science Education without following the steps.

Sample Output

Science Education 

*/

public class strings1 
{
    public static void main(String[] args) 
    {
        String cS = new String("Computer Science");
        String education = new String("Education");

        String science = new String(cS.substring(9));
        String sC = new String(science + " " + education);

        System.out.println(sC);
    }
}
