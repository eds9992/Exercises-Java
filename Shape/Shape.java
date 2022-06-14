/*Implement the Shapes hierarchy utilizing polymorphism as discussed in the reading (Section 5.5.4). 
Please do not go to the internet for help because there are lots of examples of this exercise and you will be tempted just to copy them. 
Your redraw() or draw() method just needs to say you are drawing that particular type of shape.  */

import java.awt.Color; //Had to use this instead of javafx.scene.paint

class Shape 
{
       Color color;
       void setColor(Color newColor) 
       { 
              color = newColor;
              redraw();
       }

       void redraw() 
       {
              System.out.println("Drawing a shape...");
       }
}

class Rectangle extends Shape 
{ 
       void redraw() 
       {
              System.out.println("Drawing a rectangle...");
       }
       
       void setColor(Color newColor) 
       { 
              color = newColor;
              redraw();
       }
}

class Oval extends Shape 
{ 
       void redraw() 
       {
              System.out.println("Drawing an oval...");
       }
}

class RoundRect extends Shape 
{ 
       void redraw() 
       { 
              System.out.println("Drawing a round rectangle...");
       }
}