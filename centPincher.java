/*

Cent Pincher

Paddy is trying to save money for a rainy day. He decides that he will begin by saving one cent and doubling how much he saves each day.
Write a program to find out how many cent he will have saved on a given day.
Please use a while loop to solve this question.
Please create an int called days for this program to evaluate correctly

Sample code

Day 1: 1
Day 2: 1+ 2 = 3
Day 3: 1 + 2 + 4 = 7

Sample inputs

2
3

Sample outputs

3
7

 */

public class centPincher 
{
    public static void main(String[] args) 
    {
        int days = 1;

        int centsSaved = 1;
        int totalAmount = 0;

        while(days > 0)
        {
            totalAmount = totalAmount + centsSaved;
            centsSaved = centsSaved * 2;
            days--;
        }

        System.out.println(totalAmount);
    }
}
