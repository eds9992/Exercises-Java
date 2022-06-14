/*This problem uses the PairOfDice class from Exercise 5.1 and the StatCalc class from (solution) Exercise 5.2. 
The program in Exercise 4.4 performs the experiment of counting how many times a pair of dice is rolled before a given total comes up. 
It repeats this experiment 10000 times and then reports the average number of rolls. 
It does this whole process for each possible total (2, 3, ..., 12). Redo that exercise. 
But instead of just reporting the average number of rolls, you should also report the standard deviation and the maximum number of rolls. 
Use a PairOfDice object to represent the dice. Use a StatCalc object to compute the statistics. 
(You’ll need a new StatCalc object for each possible total, 2, 3, ..., 12. You can use a new pair of dice if you want, but it’s not required.)
 */

public class DiceRoll2 
{
       static final int Experiments = 10000;
       private static PairOfDice dice = new PairOfDice();

       public static void main(String[] args) 
       {
              for (int total = 2; total <= 12; ++total) 
              {
                     StatCalc stats = new StatCalc();
                     for (int i = 0; i < Experiments; ++i) 
                     {
                            stats.enter(rollFor(total));
                     }
                     System.out.println("Dice Total: " + total);
                     System.out.println("Average Number of Rolls: " + stats.getMean());
                     System.out.println("Standard Deviation: " + stats.getStandardDeviation());
                     System.out.println ("Max Number of Rolls: " + stats.getMax());
                     System.out.println();
              }
       }

       static int rollFor(int n) 
       {
              int rollCt = 0;
              do 
              {
                     dice.roll();
                     ++rollCt;
              } while (dice.getTotal() != n);
              return rollCt;
       }
}