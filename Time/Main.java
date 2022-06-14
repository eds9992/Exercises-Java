/*Create a class Time that stores the time in 12-hour format. 
There should be fields for hours, minutes, and seconds, along with getters and setters for each field and at least two constructors. 
Create a subclass, MilTime, that stores the time in 24-hour format. 
Create the appropriate constructors, getters, and setters and provide display methods that display the time in 24 hour format: hh:mm:ss.*/

public class Main
{
       public static void main(String[] args)
       {
              Time t1 = new Time();
              t1.setHour(05);
              t1.setMin(32);
              t1.setSec(55);
              t1.print();

              Time t2 = new Time();
              t2.setHour(14);
              t2.setMin(15);
              t2.setSec(61);
              t2.print();

              MilTime t3 = new MilTime();
              t3.setHour(15);
              t3.setMin(32);
              t3.setSec(45);
              t3.print();
       }
}