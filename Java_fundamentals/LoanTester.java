package Java_fundamentals;
// Problem Statement:
// Objective: To understand how to create variables, blocks, and methods using static and how to instantiate objects outside the class for the class's private constructors.

// Problem Description: Create a Loan class for the class diagram shown

 

// ex34.1
 

// Exercise-a (Static variable and method):

// Objective: To understand how to create static variables and methods and their usage.

// Problem Description: To count the number of objects created using static variable and method

// Step 1: To the above Loan class add a static variable loanCounter and the corresponding static getter method.

 

// ex34.2
// Step 2: In both, the constructors of the Loan class add the following statement

// ex34.3
// Step 3: Use the below skeleton code for the Tester class to do the required implementation.

// public class LoanTester{
//    public static void main (String[] args){
//       //Create 2 objects of Loan class using the default and 2 using parametrized constructor.
//       //Use getter methods and display the value of loanCounter for every instance
//   }
// }
// Step 4: Compile and execute the program








class Loan1 {
    int loanNO;
    int accountNO;
    int customerNO;
    float loanAmount;
    int loanDuration;
    float interest;
    static int loanCounter;

    Loan1() {
        loanCounter++;
    }

    public int getAccountNO() {
        return accountNO;
    }

    public int getCustomerNO() {
        return customerNO;
    }

    public float getInterest() {
        return interest;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public int getLoanNO() {
        return loanNO;
    }

    Loan1(int accountNO, int customerNO, float loanAmount, int loanDuration, float interest) {
        this.accountNO = accountNO;
        this.customerNO = customerNO;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
        loanCounter++;
    }
}

class LoanTester extends Loan1 {
    public static void main(String[] args) {
        Loan1 ob1 = new Loan1(664101, 699, 40000.00f, 5, 12.5f);
        Loan1 ob2 = new Loan1(664102, 700, 50000.00f, 10, 12.5f);
        Loan1 ob3 = new Loan1();
        Loan1 ob4 = new Loan1();

        System.out.println(ob1.getAccountNO());
        System.out.println(ob2.getLoanDuration());
        System.out.println(ob3.getLoanNO());
        System.out.println(ob4.getInterest());

        System.out.println("Total loans: " + loanCounter);
    }
}






// Please analyze the following Java code for both logic and syntax errors. Provide feedback on each line and word, highlighting any issues you find. If there are no errors, please confirm that the code is correct.