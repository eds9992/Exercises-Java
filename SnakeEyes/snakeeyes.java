/* How many times do you have to roll a pair of dice before they come up snake eyes? 
You could do the experiment by rolling the dice by hand. 
Write a computer program that simulates the experiment. 
The program should report the number of rolls that it makes before the dice come up snake eyes */

public class snakeeyes
{
          public static void main(String[] args)
          {
                    boolean snakeEyes = false;
                    int rolls = 0;
                    int die1;
                    int die2;
                    do
                    {
                              die1 = (int)(Math.random()*6)+1;
                              die2 = (int)(Math.random()*6)+1;
                              rolls += 1;
                              if (die1 == 1 && die2 == 1)
                              {
                                        snakeEyes = true;
                              }
                    } while(!snakeEyes);
                    System.out.println("Snake Eyes after " + rolls + " rolls");
          }
}