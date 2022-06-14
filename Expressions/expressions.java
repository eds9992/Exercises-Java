/*Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7.
The expressions are to be typed in by the user. 
The input always consists of a number, followed by an operator, followed by another number. 
The operators that are allowed are +, -, *, and /. 
You can read the numbers with TextIO.getDouble() and the operator with TextIO.getChar(). 
Your program should read an expression, print its value, read another expression, print its value, and so on. 
The program should end when the user enters 0 as the ﬁrst number on the line.*/

import textio.TextIO;

public class expressions
{
       static void cout(String value) 
       {
              System.out.println(value);
       }
       public static void main(String[] args)
       {
              double n = TextIO.getDouble();
              double n2 = TextIO.getlnDouble();
              char op = TextIO.getChar();
              double s = 0;
              
              System.out.println("Enter an expression, or 0 to exit");
              while(true)
              {
                     n = TextIO.getDouble();
                     if(n == 0)
                     {
                            break;
                     }
                     n2 = TextIO.getlnDouble();
                     op = TextIO.getChar();

                     switch (op) 
                     {
                     case '+':
                            s = n + n2;
                            break;
                     case '-':
                            s = n - n2;
                            break;
                     case '*':
                            s = n * n2;
                            break;
                     case '/':
                            s = n / n2;
                            break;
                     default:
                            System.out.println("Unknown operator: " + op);
                     }

                     System.out.println("Solution: " + s);
              }
       }
}

//CODE USING SCANNER
/*import java.util.Scanner;

public class expressions
{
    static void cout(String value) 
    {
        System.out.println(value);
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double n;
        double n2;
        char op;
        double s = 0;
        
        cout("Enter an expression, or 0 to exit");
        while(true)
        {
            n = in.nextDouble();
            if(n == 0)
            {
                break;
            }
            n2 = in.nextDouble();
            op = in.next().charAt(0);
            
            switch (op) 
            {
            case '+':
                s = n + n2;
                cout(n + " + " + n2 + " = " + s);
                break;
            case '-':
                s = n - n2;
                break;
            case '*':
                s = n * n2;
                break;
            case '/':
                s = n / n2;
                break;
            default:
                cout("Unknown operator: " + op);
            }
            
            cout("Solution: " + s);
        }
    }
}*/