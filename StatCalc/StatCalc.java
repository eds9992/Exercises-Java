/* A common programming task is computing statistics of a set of numbers. 
(A statistic is (solution) a number that summarizes some property of a set of data.) 
Common statistics include the mean (also known as the average) 
and the standard deviation (which tells how spread out the data are from the mean). 
I have written a little class called StatCalc that can be used to compute these statistics, 
as well as the sum of the items in the dataset and the number of items in the dataset. 
You can read the source code for this class in the ﬁle StatCalc.java. 
If calc is a variable of type StatCalc, then the following instance methods are available:
       • calc.enter(item) where item is a number, adds the item to the dataset. 
       • calc.getCount() is a function that returns the number of items that have been added to the dataset. 
       • calc.getSum() is a function that returns the sum of all the items that have been added to the dataset. 
       • calc.getMean() is a function that returns the average of all the items. 
       • calc.getStandardDeviation() is a function that returns the standard deviation of the items.
Typically, all the data are added one after the other by calling the enter() method over and over, as the data become available. 
After all the data have been entered, any of the other methods can be called to get statistical information about the data. 
The methods getMean() and getStandardDeviation() should only be called if the number of items is greater than zero. */
/*/Modify the current source code, StatCalc.java, to add instance methods getMax() and getMin(). 
The getMax() method should return the largest of all the items that have been added to the dataset, 
and getMin() should return the smallest. You will need to add two new instance variables to 
keep track of the largest and smallest items that have been seen so far. 
Test your new class by using it in a program to compute statistics for a set of non-zero numbers entered by the user. 
Start by creating an object of type StatCalc:
       StatCalc calc; // Object to be used to process the data. 
       calc = new StatCalc();
Read numbers from the user and add them to the dataset. 
Use 0 as a sentinel value (that is, stop reading numbers when the user enters 0). After all the user’s non-zero
numbers have been entered, print out each of the six statistics that are available from calc.
*/

import java.util.Scanner;

class DataSet
{
       public static void main(String[] args)
       {
              Scanner in = new Scanner(System.in);
              StatCalc calc = new StatCalc();
              int value;
       
              System.out.println("Enter your numbers, and then 0 to end.");
              System.out.println();
       
              do 
              {
                     System.out.print(" ");
                     value = in.nextInt();
                     if (value > 0)
                     {
                            calc.enter(value);
                     }
              } while (value > 0);

              System.out.println("Count: " + calc.getCount());
              System.out.println("Sum: " + calc.getSum());
              System.out.println("Minimum: " + calc.getMin());
              System.out.println("Maximum: " + calc.getMax());
              System.out.println("Average: " + calc.getMean());
              System.out.println("Standard Deviation: " + calc.getStandardDeviation());
              in.close();
       }
}

public class StatCalc 
{
       private int count;
       private int max;
       private int min;
       private double sum;
       private double squareSum;

       public void enter(int num) 
       {
              count++;
              sum += num;
              squareSum += num*num;
              if(num > max)
              {
                     max = num;
              }
              if(num < min)
              {
                     min = num;
              }
       }

       public int getCount() 
       {
              return count;
       }

       public double getSum() 
       {
              return sum;
       }

       public double getMean() 
       {
              return sum / count;  
       }

       public int getMax()
       {
              return max;
       }

       public int getMin()
       {
              return min;
       }

       public double getStandardDeviation() 
       {  
              double mean = getMean();
              return Math.sqrt( squareSum/count - mean*mean );
       }
}