package Java_fundamentals;
// Problem Statement:
// Objective: To develop a Java program to understand the usage of static and final keywords.

 

// Problem Description: Let us create a performance rating system to calculate the performance of each employee.

// Create an Employee class with an instance variable point: int with private access modifier. Generate getter and setter method of the instance variable.

// Create a class called "PerformanceRating" keep four class variables with constant value and private access modifier: Outstanding: int, Good: int, Average: int, and Poor: int

// Outstanding=5
// Good=4
// Average=3
// Poor=2
// Create a static method to calculate the performance of each employee.

// static int calculatePerformace (Employee employee){ }
// Calculate the performance of each employee based on some business rules:

// Note: The point of each employee should be less than 100.

// If the point is between 80 -100 give outstanding rating.
// If the point is between 60- 79 give good rating.
// If the point is between 50- 59 give average rating.
// If the point is between 1- 49 give poor rating.
 

// Develop the main class "PerformanceCalculator". Create 3 employee objects, set their point, and calculate their performance rating based on the point they have achieved, and print their respective rating on the console.











class Employee
{
    private int point;
    private int Rating;

    Employee(int point)
    {
        this.point = point;
    }

    int getPoint()
    {
        return point;
    }

    int getRating()
    {
        return Rating;

    }
    static int calculatePerformance(Employee employee, int  Outstanding, int Average, int Good, int Poor)
    {
        if( employee.point >= 80 && employee.point <= 100)
        {
            employee.Rating = Outstanding;
            return employee.Rating;
        }
        else if( employee.point >= 60 && employee.point <= 79)
        {
            employee.Rating = Good;
            return employee.Rating;
        }
        else if( employee.point >= 50 && employee.point <= 59)
        {
            employee.Rating = Average;
            return employee.Rating;
        }
        else if( employee.point >= 1 && employee.point <= 49)
        {
            employee.Rating = Poor;
            return employee.Rating;
        }
        else
        {
            employee.Rating = 0;
            return employee.Rating;
        }
}
}
class PerformanceRating
{
    private  static final int Outstanding = 5;
    private static final int Good = 4;
    private static final int Average = 3;
    private static final int Poor = 2;
    public static void main(String[] args)
    {

    Employee ob1 = new Employee(40);
    Employee ob2 = new Employee(60);
    Employee ob3 = new Employee(80);

    Employee.calculatePerformance(ob1,Outstanding,Good,Average,Poor);
    Employee.calculatePerformance(ob2,Outstanding,Good,Average,Poor);
    Employee.calculatePerformance(ob3,Outstanding,Good,Average,Poor);

    System.out.println(ob1.getRating());
    System.out.println(ob2.getRating());
    System.out.println(ob3.getRating());
    }
}