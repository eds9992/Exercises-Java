/*Create a class that stores data about a student. The fields should include the student's name, their major, their id (make something up), and a list of courses they are taking. 
Include getters and setters for the name and major. Use the class to create at least three students. Each student should be taking four courses. 
Your program should include adding the data to the Student objects (either through assignment or interactively) and should also display the data stored in each object.*/

public class studentList
{
       public static void main(String[] args) 
       {
              Student std1 = new Student();
              std1.setName("Dave");
              std1.setMajor("Architecture");
              std1.id = 01;
              std1.courseList[0] = "Art History";
              std1.courseList[1] = "Physics for Architects";
              std1.courseList[2] = "Design Methods";
              std1.courseList[3] = "Studio";
              std1.print();

              Student std2 = new Student();
              std2.setName("Katie");
              std2.setMajor("History");
              std2.id = 02;
              std2.courseList[0] = "World History";
              std2.courseList[1] = "History of Eastern Cultures";
              std2.courseList[2] = "Ancient Cultures";
              std2.courseList[3] = "History of the Americas to 1877";
              std2.print();

              Student std3 = new Student();
              std3.setName("John");
              std3.setMajor("Finance");
              std3.id = 03;
              std3.courseList[0] = "Calculus 1";
              std3.courseList[1] = "Introduction to Accounting";
              std3.courseList[2] = "Excel Methods";
              std3.courseList[3] = "Organizational Writing";
              std3.print();
       }
       
}

class Student
{
       private String name; 
       private String major;
       int id;
       String[] courseList = new String[4]; 

       public void setName(String name)
       {
              this.name = name;
       }

       public String getName()
       {
              return name;
       }

       public void setMajor(String major)
       {
              this.major = major;
       }

       public String getMajor()
       {
              return major;
       }

       public void print()
       {
              System.out.println("NAME: " + getName());
              System.out.println("MAJOR: " + getMajor());
              System.out.println("ID: " + id);
              System.out.print("COURSES: ") ;
              for(int i = 0; i < 4; ++i)
              {
                     if(i == 3)
                     {
                            System.out.println( courseList[i]); 
                            System.out.println(""); 
                     }
                     else
                     {
                            System.out.print( courseList[i] + ", ");
                     }
              }
       }
}


