/* Suppose that a ﬁle contains information about sales ﬁgures for a company in various cities. 
Each line of the ﬁle contains a city name, followed by a colon (:) followed by the data for that city. 
The data is a number of type double. However, for some cities, no data was available. 
In these lines, the data is replaced by a comment explaining why the data is missing. For example, several lines from the ﬁle might look like:
              San Francisco: 19887.32 
              Chicago: no report received 
              New York: 298734.12
Write a program that will compute and print the total sales from all the cities together. 
The program should also report the number of cities for which data was not available. 
The name of the ﬁle is “sales.dat”. 
To complete this program, you’ll need one fact about ﬁle input with TextIO that was not covered in Subsection 2.4.4. 
Since you don’t know in advance how many lines there are in the ﬁle, you need a way to tell when you have gotten to the end of the ﬁle. 
When TextIO is reading from a ﬁle, the function TextIO.eof() can be used to test for end of ﬁle. 
This boolean-valued function returns true if the ﬁle has been entirely read and returns false if there is more data to read in the ﬁle. 
This means that you can read the lines of the ﬁle in a loop while (TextIO.eof() == false).... 
The loop will end when all the lines of the ﬁle have been read. Suggestion: For each line, read and ignore characters up to the colon. 
Then read the rest of the line into a variable of type String. Try to convert the string into a number, and use try..catch to test whether the conversion succeeds.
 */

import textio.TextIO;
   
public class sales 
{
       public static void main( String[] args ) 
       {
              TextIO.readFile("sales.dat");

              double total = 0;
              int missing = 0;

              while (!TextIO.eof()) 
              {
                     char ch;
                     String data;
                     double sales;

                     do 
                     {
                            ch = TextIO.getChar();
                     } while (ch != ':');

                     data = TextIO.getln();

                     try 
                     {
                            sales = Double.parseDouble(data);
                            total += sales;
                     }
                     catch (NumberFormatException e) 
                     {
                            ++missing;
                     }
              }

              System.out.printf("Total sales from all cities: $%1.2f\n\n", total);
              if (missing == 0) 
              {
                     System.out.println("Data  received from all cities.");
              } 
              else if (missing == 1) 
              {
                     System.out.println("Data  missing from 1 city.");
              } 
              else 
              {
                     System.out.printf("Data  missing from %d cities.\n", missing);
              }
       } 
}