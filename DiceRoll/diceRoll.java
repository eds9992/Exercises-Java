/*Write a function that simulates rolling a pair of dice until the total on the dice comes up to be a given number. 
The number that you are rolling for is a parameter to the function. 
The number of times you have to roll the dice is the return value of the function. 
The parameter should be one of the possible totals: 2, 3, ..., 12. 
The function should throw an IllegalArgumentException if this is not the case. 
Use your function in a program that computes and prints the number of rolls it takes to get snake eyes. 
(Snake eyes means that the total showing on the dice is 2.)*/

public class diceRoll
{
       static int roll(int n)
       {
              int d1, d2;
              int total;
              int count = 0;
              if (n >= 2 || n <= 12)
              {
                     do 
                     {
                            d1 = (int)(Math.random()*6) + 1;
                            d2 = (int)(Math.random()*6) + 1;
                            total = d1 + d2;
                            ++count;
                     } while (total != n);
                     return count;
              }
              else
              {
                     throw new IllegalArgumentException("Not a valid value");
              }
       }

       public static void main(String args[])
       {
              int numRolls;
              numRolls = roll(2);
              System.out.println("Snake eyes in " + numRolls);
       }
}