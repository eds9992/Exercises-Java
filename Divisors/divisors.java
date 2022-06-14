/*  Which integer between 1 and 10000 has the largest number of divisors, and how many divisors does it have? 
Write a program to ﬁnd the answers and print out the results. 
It is possible that several integers in this range have the same, maximum number of divisors. 
Your program only has to print out one of them. You might need some hints about how to ﬁnd a maximum value. 
The basic idea is to go through all the integers, keeping track of the largest number of divisors that you’ve seen so far. 
Also, keep track of the integer that had that number of divisors.
 */

 public class divisors
 {
          static void cout(String value) 
          {
                    System.out.println(value);
          }

          public static void main(String[] args) 
          {
                    int divisors = 0;
                    int numMax = 0;

                    for (int i = 2; i <= 10000; ++i) {
                              int count = 0;

                              for (int n = 1; n <= i; ++n)
                              {
                                        if (i % n == 0) 
                                        {
                                                  count++;
                                        }
                              }

                              if (count > divisors) 
                              {
                                        divisors = count;
                                        numMax = i;
                              }
                    }
                    cout("Maximum number of divisors: " + divisors);
                    cout("Number with maximum divisors: " + numMax);
          }
 }