public class Main
{
       public static void main(String[] args) 
       {
              Shape someShape = new Shape();
              someShape.redraw();

              Shape[] shapeList = {new Rectangle(), new Oval(), new RoundRect()};
              for (int i = 0; i < shapeList.length; ++i) 
              { 
                     Shape shape = shapeList[i]; 
                     shape.redraw();
              }
       }
}