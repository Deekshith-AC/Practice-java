package Java_fundamentals;
// Exercise-b (Usage of static blocks):

// Objective: To understand how to use static blocks.

// Problem Description: To count the number of instances (Objects created) using static block

// Step 1: Now assume that 100 users have already visited the loan class. Now the count will start from 101. Use static block to initialize the loanCounter variable to 101 in the loan class.

// Step 2: Use the below skeleton code for the Tester class to do the  required implementation.

// public class LoanTester{
//    public static void main (String[] args){
//       //Create 2 objects of Loan class using the default and 2 using parametrized constructor.
//       //Use getter methods and display the value of loanCounter for every instance
//   }
// }
// Step 3: Compile and execute the program











class Loan2 {
    int loanNO;
    int accountNO;
    int customerNO;
    float loanAmount;
    int loanDuration;
    float interest;
    static int loanCounter;

    static
    {
        loanCounter = 100;
    }

    Loan2() 
    {
        loanCounter++;
    }

    public int getAccountNO()
    {
        return accountNO;
    }

    public int getCustomerNO() 
    {
        return customerNO;
    }

    public float getInterest() 
    {
        return interest;
    }

    public float getLoanAmount() 
    {
        return loanAmount;
    }

    public int getLoanDuration() 
    {
        return loanDuration;
    }

    public int getLoanNO() 
    {
        return loanNO;
    }

    Loan2(int accountNO, int customerNO, float loanAmount, int loanDuration, float interest) {
        this.accountNO = accountNO;
        this.customerNO = customerNO;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
        loanCounter++;
    }
}

class LoanTester2 extends Loan2
{
    public static void main(String[] args)
    {
        Loan2 ob1 = new Loan2(664101, 699, 40000.00f, 5, 12.5f);
        Loan2 ob2 = new Loan2(664102, 700, 50000.00f, 10, 12.5f);
        Loan2 ob3 = new Loan2();
        Loan2 ob4 = new Loan2();

        System.out.println(ob1.getAccountNO());
        System.out.println(ob2.getLoanDuration());
        System.out.println(ob3.getLoanNO());
        System.out.println(ob4.getInterest());
        System.out.println("Total loans: " + loanCounter);
    }
}




// Please analyze the following Java code for both logic and syntax errors. Provide feedback on each line and word, highlighting any issues you find. If there are no errors, please confirm that the code is correct.