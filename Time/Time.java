/*Create a class Time that stores the time in 12-hour format. 
There should be fields for hours, minutes, and seconds, along with getters and setters for each field and at least two constructors. 
Create a subclass, MilTime, that stores the time in 24-hour format. 
Create the appropriate constructors, getters, and setters and provide display methods that display the time in 24 hour format: hh:mm:ss.*/

public class Time
{
       private int hour; 
       private int minutes;
       private int seconds;

       public Time(int h, int m, int s)
       {
              hour = h;
              minutes = m;
              seconds = s;
       }

       public Time(int h, int m)
       {
              hour = h;
              minutes = m;
              seconds = 0;
       }

       public Time(int h)
       {
              hour = h;
              minutes = 0;
              seconds = 0;
       }
       
       public Time()
       {
              hour = 0;
              minutes = 0;
              seconds = 0;
       }

       public int getHour()
       {
              return hour;
       }

       public void setHour(int h)
       {
              this.hour = h;
              if(h > 12)
              {
                     int res = h - 12;
                     this.hour = res;
              }
       }

       public int getMin()
       {
              return minutes;
       }

       public void setMin(int m)
       {
              this.minutes = m;
              if(m > 59)
              {
                     ++hour;
                     int res = m - 60;
                     this.minutes = res;
              }
       }

       public int getSec()
       {
              return seconds;
       }

       public void setSec(int s)
       {
              this.seconds = s;
              if(s > 59)
              {
                     ++minutes;
                     int res = s - 60;
                     this.seconds = res;
              }
       }

       public void print()
       {
              String time = String.format("%02d:%02d:%02d", hour, minutes, seconds);
              System.out.println(time);
       }
}