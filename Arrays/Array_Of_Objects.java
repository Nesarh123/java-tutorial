package Arrays;

class Student
{
    int rollno;
    String name;
    int marks;
}
public class Array_Of_Objects 
{
    public static void main(String[] args) 
    {
            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "Nesar";
            s1.marks = 98;
            
            Student s2 = new Student();
            s2.rollno = 2;
            s2.name = "Ravindera";
            s2.marks = 95;

            Student s3 = new Student();
            s3.rollno = 3;
            s3.name = "Sachin";
            s3.marks = 97;

            Student students[] = new Student[3];
            students [0] = s1;
            students [1] = s2;
            students [2] = s3;

            // for (int i=0; i<students.length; i++)
            // {
            //     System.out.println(students[i].rollno + " : " + students[i].name + " : " + students[i].marks);
            // }

            for (Student stud : students)
            {
                System.out.println(stud.rollno + " : " + stud.name + " : " + stud.marks);
            }
    }
}
