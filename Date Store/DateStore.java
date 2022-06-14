/*Create a class that stores a date, such as June 24, 2019. 
Create constructors for instantiating a date with all three fields, with just the month and the year, one that just sets the year, 
and a default constructor that sets all fields to default values. */

public class DateStore
{
       public static void main(String[] args) 
       {
              Date d1 = new Date();
              d1.month = "June";
              d1.day = 24;
              d1.year = 2019;
              d1.print();
              
              Date d2 = new Date();
              d2.month = "September";
              d2.year = 1992;
              d2.print();
              
              Date d3 = new Date();
              d3.year = 1969;
              d3.print();

              Date d4 = new Date();
              d4.print();
       }
}

class Date
{
       public String month; 
       public int day;
       public int year;;

       public Date(String m, int d, int y)
       {
              month = m;
              day = d;
              year = y;
       }

       public Date(String m, int y)
       {
              month = m;
              day = 0;
              year = y;
       }

       public Date(int y)
       {
              month = "";
              day = 0;
              year = y;
       }

       public Date()
       {
              month = "";
              day = 0;
              year = 0;
       }

       public void print()
       {
              if(month != "" && day != 0 && year != 0)
              {
                     System.out.println("DATE: " + month + "/" + day + "/" + year);                     
              }
              else if(month != "" && day == 0 && year != 0)
              {
                     System.out.println("DATE: " + month + "/" + year);
              }
              else if(month == "" && day == 0 && year != 0)
              {
                     System.out.println("DATE: " + year);
              }
              else
              {
                     System.out.println("No valid date");
              }
       }
}