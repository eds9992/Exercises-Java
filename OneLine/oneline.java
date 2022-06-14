/*Write a program that reads one line of input text and breaks it up into words. 
The words should be output one per line.
Any characters in the input that are not letters should be discarded. 
For example, if the user inputs the line "He said, "That’s not a good idea.", then the output of the program should be
He 
said 
That 
s 
not 
a 
good 
idea
An improved version of the program would list “that’s” as a single word. 
An apostrophe can be considered to be part of a word if there is a letter on each side of the apostrophe. 
To test whether a character is a letter, you might use (ch >= ’a’ && ch <= ’z’) || (ch >= ’A’ && ch <= ’Z’). 
However, this only works in English and similar languages. 
A better choice is to call the standard function Character.isLetter(ch), 
which returns a boolean value of true if ch is a letter and false if it is not.  */

import java.util.Scanner;

public class oneline
{
       public static void main(String[] args) 
       {
              Scanner ln = new Scanner(System.in);
              
              String s;    
              int i;         
              char ch;
              boolean didCR;  
              
              System.out.print("Enter a line of text.");
              s = ln.nextLine();
              didCR = true;
              
              for ( i = 0;  i < s.length();  i++ ) 
              {
                     ch = s.charAt(i);
                     if ( Character.isLetter(ch) ) 
                     {
                            System.out.print(ch);
                            didCR = false;
                     }
                     else 
                     {
                            if ( didCR == false ) 
                            {
                                   System.out.println();
                            }
                     }
              }
              System.out.println();
       } 
 }