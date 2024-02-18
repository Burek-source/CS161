/*

Restaurant Reviews

Write a Java program that uses a switch statement to give restaurants feedback based on their average star review. Declare an int variable called stars and set it to the default 1. 
The program should print the messages below based on the value of stars.

'1' - Poor Quality Restaurant
'2' - Below Average Restaurant
'3' - Average Quality Restaurant
'4' - Very Good Restaurant
'5' - Excellent Restaurant
Any other integer value - Not a valid number of stars

You must use the values given and you must not "hard-code" results. Your answers must match EXACTLY.

Sample inputs

3
7

Sample outputs

Average Quality Restaurant
Not a valid number of stars

 */


public class restaurantReviews 
{
    public static void main (String[] args)
    {
        
        int stars = 1;

        switch(stars)
        {

            case 1 : System.out.println("Poor Quality Restaurant"); break;
            case 2 : System.out.println("Below Average Restaurant"); break;
            case 3 : System.out.println("Average Quality Restaurant"); break;
            case 4 : System.out.println("Very Good Restaurant"); break;
            case 5 : System.out.println("Excellent Restaurant"); break;
            default : System.out.println("Not a valid number of stars"); break;
        }
    }
}
