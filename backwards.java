/*

Description

Write a Java program that takes a String, called sentence that references a lowercase String. The program should print the String in reverse word by word. 
Your String should be assigned the value pay no attention to that man behind the curtain and should be printed as the sample output below. 

Sample Output

curtain
the
behind
man
that 
to
attention
no
pay 

*/

public class backwards 
{
    public static void main(String[] args) 
    {
        String sentence = new String("pay no attention to that man behind the curtain");

        String reversed = "";
        String ordered = "";

        for (int i = sentence.length()-1; i >= 0; i--)
        {
            char charAtI = sentence.charAt(i);
            reversed = reversed + charAtI;

            if (charAtI == ' ')
            {
                int count = reversed.length();

                while(count != 0)
                {
                    char atJ = reversed.charAt(count - 1);
                    ordered = ordered + atJ;
                    count--;

                    if(count == 0)
                    {
                        System.out.println(ordered);
                        ordered = "";
                        reversed = "";
                    }
                }
            }
        }
        for (int i = reversed.length()-1; i >= 0; i--)
            {
                char charAtI = reversed.charAt(i);
                ordered = ordered + charAtI;
            }  
            System.out.println(ordered);
    }
}
