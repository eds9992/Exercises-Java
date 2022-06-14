/*Write a program that administers a basic addition quiz to the user. There should be ten questions. 
Each question is a simple addition problem such as 17 + 42, where the numbers in the problem are chosen at random (and are not too big). 
The program should ask the user all ten questions and get the user's answers. After asking all the questions, the user should print each question again, with the user's answer. 
If the user got the answer right, the program should say so; if not, the program should give the correct answer. At the end, tell the user their score on the quiz, where each correct answer counts for ten points.
The program should use three subroutines, one to create the quiz, one to administer the quiz, and one to grade the quiz. It can use three arrays, with three global variables of type int[], to refer to the arrays. 
The first array holds the first number from every question, the second holds the second number from every questions, and the third holds the user's answers.*/
import java.util.Scanner;

public class additionQuiz
{
       private static int[] fNums, sNums, userAns;

       private static void createQuiz() 
       {
              fNums = new int[10];
              sNums = new int[10];
              for (int i = 0; i < 10; ++i) 
              {
                     fNums[i] = (int) (Math.random() * 50 + 1);
                     sNums[i] = (int) (Math.random() * 50);
              }
       }

       private static void startQuiz() 
       {
              Scanner ans = new Scanner(System.in);
              userAns = new int[10];
              for (int i = 0; i < 10; ++i) 
              {
                     int qNum = i + 1;
                     System.out.printf("%2d: %2d + %2d = ", qNum, fNums[i], sNums[i]);
                     userAns[i] = ans.nextInt();
              }
              ans.close();
       }

       private static void gradeAns() 
       {
              System.out.println("Correct answers:");
              int correctCount = 0;
              int grade;
              for (int i = 0; i < 10; ++i) 
              {
                     int qNum = i + 1;
                     int cAns= fNums[i] + sNums[i];
                     System.out.printf("Question %2d:  %2d + %2d  =  %2d.  ", qNum, fNums[i], sNums[i], cAns);
                     if (userAns[i] == cAns) 
                     {
                            System.out.println("Correct answer!");
                            ++correctCount;
                     } 
                     else 
                     {
                            System.out.println("You answer " + userAns[i] + " is incorrect.");
                     }
              }
              grade = correctCount * 10;
              System.out.println("Number of correct answers: " + correctCount);
              System.out.println("Grade: " + grade);
       }

       public static void main(String[] args)
       {
              createQuiz();
              startQuiz();
              gradeAns();
       }
}