/* 

Description

Create a String called addSpaces. Print this String out, adding spaces in between each letter. If there is already a space between 2 letters, another one should NOT be added.

Sample Input 

1
notebook

Sample Output 1

n o t e b o o k

Sample Input 2

cup of tea

Sample Output 2

c u p o f t e a

*/

public class spaces 
{
    public static void main(String[] args) 
    {
        String addSpaces = new String("notebook");
        String spaces = "";

        spaces = spaces + addSpaces.charAt(0) + " ";

        for (int i = 1; i <= addSpaces.length()-1; i++)
        {
            char charAtI = addSpaces.charAt(i);

            if (charAtI != ' ')
            {
                spaces = spaces + charAtI;
                spaces = spaces + " ";
            }
        }

        System.out.println(spaces);
    }
}
