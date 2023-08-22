package Java_fundamentals;
enum Grade
{
    A, B, C, D, E;
}



class Student 
{
    int studentId;
    String name;
    Grade grade;
    int schloarshipAmount;
    int totalMarks;

    Student(int studentId, String name, int totalMarks)
    {
        this.totalMarks = totalMarks;
        this.grade = calculateGrade(totalMarks);
        this.name = name;
        this.studentId = studentId;
        this.schloarshipAmount = calculateScholarshipAmount(this.grade);
    }

    int getstudentId()
    {
        return studentId;
    }
    Grade getgrade()
    {
        return grade;
    }

    String getname()
    {
        return name;
    }

    int gettotalMarks()
    {
        return totalMarks;
    }

    Grade calculateGrade(int totalMarks)
    {
        if(totalMarks >= 250)
        {
            return Grade.A;
        }
        else if(totalMarks >= 200 && totalMarks < 250)
        {
            return Grade.B;
        }
        else if(totalMarks >= 175 && totalMarks < 200)
        {
            return Grade.C;
        }
        else if(totalMarks >= 150 && totalMarks < 175)
        {
            return Grade.D;
        }
        else
        {
            return Grade.E;
        }
    }

    Grade getGrade()
    {
        return grade;
    }

    int getScholarshipAmount()
    {
        return schloarshipAmount;
    }

    public int calculateScholarshipAmount(Grade grade) {
    switch (grade) {
        case A:
            return 5000;

        case B:
            return 4000;

        case C:
            return 3000;

        case D:
            return 2000;

        default:
            return 0;
    }
}

}
public class EnumExercise 
{
public static void main(String[] args)
{
Student s1 = new Student(1000,"alvin",280);
System.out.println("Student Details");
System.out.println("Student Id:"+s1.getstudentId());
System.out.println("Student Name:"+s1.getname());
System.out.println("Student Grade:"+s1.getGrade());
System.out.println("Scholarship amount:" +s1.getScholarshipAmount());
}
}
