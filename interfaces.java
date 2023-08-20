// interfaces.java
 interface DataProvider
 {
    int totalMaximumMarks = 8000;
    void calPercentage();
    double getPercentage();
 }
 class Intern implements DataProvider
 {
    int marksSecured;
    int graceMarks;
    int total = 0;
    double maxPer = 100.00;
    double percentage = 0.0;

    Intern(int marksSecured, int graceMarks)
    {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
        total = marksSecured + graceMarks;
        if (total > totalMaximumMarks)
        {
            System.out.println("Please enter the correct marks");
        }
        else
        {
            getPercentage();
        }
    }
    public void calPercentage()
    {
        int total = marksSecured + graceMarks;
        percentage = ((double)total* maxPer) / (double)totalMaximumMarks;
    }
    public double getPercentage()
    {
         calPercentage();
        System.out.println("The total aggregate percentage secured is " + percentage + "%");
        return percentage;
    }
 }
class Trainee implements DataProvider
 {
    int marksSecured;
    double maxPer = 100.00;
    double percentage = 0.0;

    Trainee(int marksSecured)
    {
        this.marksSecured = marksSecured;
        if (marksSecured > totalMaximumMarks)
        {
            System.out.println("Please enter the correct marks");
        }
        else
        {
            getPercentage();
        }
    }
    public void calPercentage()
    {
        percentage = ((double)marksSecured* maxPer) / (double)totalMaximumMarks;
    }
    public double getPercentage()
    {
        calPercentage();
        System.out.println("The total aggregate percentage secured is " + percentage + "%");
        return percentage;
    }
 }

public class interfaces
{
    public static void main(String[] args)
    {
        DataProvider i1 = new Intern(5000, 500);
        System.out.println();
        DataProvider t1 = new Trainee(6000);
        System.out.println();
        DataProvider i2 = new Intern(8000, 500);
        System.out.println();
    }
    
}
