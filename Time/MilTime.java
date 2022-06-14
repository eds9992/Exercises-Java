public class MilTime extends Time
{
       private int hour;

       public int getHour()
       {
              return hour;
       }

       public void setHour(int h)
       {
              this.hour = h;
              if(h > 24)
              {
                     this.hour = 0;
              }
       }

       public void print()
       {
              int minutes = getMin();
              int seconds = getSec();
              String time = String.format("%02d:%02d:%02d", hour, minutes, seconds);
              System.out.println(time);
       }
}