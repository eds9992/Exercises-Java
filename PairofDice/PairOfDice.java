/* In all versions of the PairOfDice class in Section 5.2, the instance variables die1 and die2 (solution) are declared to be public. 
They really should be private, so that they would be protected from being changed from outside the class. 

Write another version of the PairOfDice class in which the instance variables die1 and die2 are private. 
Your class will need “getter” methods that can be used to ﬁnd out the values of die1 and die2. 
(The idea is to protect their values from being changed from outside the class, but still to allow the values to be read.) 
Include other improvements in the class, including at least a toString() method. 
Test your class with a short program that counts how many times a pair of dice is rolled, before the total of the two dice is equal to two.
*/

class RollTwoPairs 
{
       public static void main(String[] args) 
       {
              PairOfDice pair = new PairOfDice();

              int countRolls = 0;
              int total;

              do 
              {
                     pair.roll();

                     System.out.println("First dice comes up " + pair.getDie1());
                     System.out.println("Second dice comes up " + pair.getDie2());

                     total = pair.getDie1() + pair.getDie2();

                     countRolls++;
                     System.out.println();
              } while (total != 2);
              System.out.println("It took " + countRolls + " rolls until the total was equal to 2.");
       }
}

public class PairOfDice 
{
       private int die1;
       private int die2;

       public void setDie1(int value)
       {
              die1 = value;
       }

       public int getDie1()
       {
              return die1;
       }

       public void setDie2(int value)
       {
              die2 = value;
       }

       public int getDie2()
       {
              return die2;
       }

       public PairOfDice() 
       {
              roll();
       }

       public PairOfDice(int val1, int val2) 
       {
              die1 = val1;
              die2 = val2;
       }

       public void roll() 
       {  
              die1 = (int)(Math.random()*6) + 1; 
              die2 = (int)(Math.random()*6) + 1; 
       }
}