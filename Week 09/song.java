/*

Description

Write a Java program that uses a random number generated (in the range of 2 to 20, inclusive) and a while loop to print out the song shown below, 
with the number of verses depending on the random number generated. In the sample output the random number 10 was used. 

Important Note: 

You must print your random number with the text "Random Number: x" where x is your Random Number please see the sample output for an example

Sample Output

Random Number: 10
10 in a bed and the little one said,
'Roll over, roll over'
They all rolled over and one fell out,
9 in a bed and the little one said,
'Roll over, roll over'
They all rolled over and one fell out,
8 in a bed and the little one said,
1 in a bed and the little one said, 'Alone at last' 

*/

import java.util.Random;

public class song 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int randomInt = rand.nextInt(19) + 2;

        System.out.println("Random Number: " + randomInt);
        System.out.println("");

        while(randomInt > 0)
        {
            System.out.println(randomInt + " in a bed and the little one said, \n'Roll over, roll over'\nThey all rolled over and over and fell out,");
            System.out.println("");

            randomInt--;
        }
    }
}
