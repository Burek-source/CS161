/*

Description

Write a Java program that uses a nested while-loop to print to the screen the following pattern:

#
##
### 
####
#####

*/

public class nestedWhileLoop 
{
    public static void main(String[] args) 
    {
        int count = 1;

        while(count < 6)
        {
            for(int j = 0; j < count; j++)
            {
                System.out.print("#");
            }
            System.out.println("");
            count++;
        }
    }
}
