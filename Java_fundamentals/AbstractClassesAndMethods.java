//AbstractClassesAndMethods.java
package Java_fundamentals;

abstract class RRPaymentServices
{
    double balance;
    int customerId;
    RRPaymentServices(double balance, int customerId)
    {
        this.balance = balance;
        this.customerId = customerId;
    }
     double getBalance()
     {
        return balance;
     }

     int getCustomerID()
     {
        return customerId;
     }
     abstract void payBill(double amount);
}
class ShoppingPayment extends RRPaymentServices
{
    String paymentID;
    static int Scounter = 1;
    double balanceDue;
    double previousDue;
    ShoppingPayment(double balance, int customerId)
    {
        super(balance, customerId);
    }
    double getpreviousDue()
    {
        return previousDue;
    }
    double getBalanceDue()
    {
        return balanceDue;
    }
    String getPaymentID()
    {
        return paymentID;
    }
     void payBill(double amount)
    {
        if(amount > getBalance())
        {
            System.out.println("Excess amount eneterd!!  Please try again");
            System.out.println();
            return;
        }
        else if(amount < getBalance())
        {
            System.out.println("Insufficent Balance !!  Please try again");
            System.out.println();
            return;
        }
        else 
        {
        paymentID = String.format("S" + "%04d", Scounter++);
        previousDue = getBalance();
        balanceDue = getBalance() - amount;
        String j = "Congratulations!! You have successfully made a payment of Rs. " + amount + ". Payment Details are :";
        System.out.println(j);
        int l = j.length() + 5;
        String r = "";
        for(int s = 1; s < l; s++)
        {
            r += "*";
        }
        System.out.println(r);
        display();
        }
    }
    void display () 
    {
        System.out.println("Customer ID: " + getCustomerID());
        System.out.println("Payment ID: " + getPaymentID());
        System.out.println("Previous Due: Rs." + getpreviousDue());
        System.out.println("Remaining Due: Rs." + getBalanceDue());
        System.out.println();
    }
}
class CreditCardPayment extends RRPaymentServices
{
    double cashBack;
    static int counter = 1;
    String paymentID;
    double previousDue;
    double balanceDue;
    CreditCardPayment(double balance, int customerId)
    {
        super(balance, customerId);
    }
    String getPaymentID()
    {
        return paymentID;
    }
    double getpreviousDue()
    {
        return previousDue;
    } 
    double getCashBack()
    {
        return cashBack;
    }
    double getBalanceDue()
    {
        return balanceDue;
    }
     void payBill(double amount)
    {
        paymentID = String.format("C" + "%04d", counter++);
        previousDue = getBalance();
        if(amount >= getBalance())
        {
            balanceDue = 0;
            cashBack = amount - getBalance();
        }
        else
        {
            balanceDue = getBalance() - amount;
        }
        String j = "Congratulations!! You have successfully made a payment of Rs." + amount + ". Payment Details are :";
        System.out.println(j);
        int l = j.length() + 5;
        String r = "";
        for(int s = 1; s < l; s++)
        {
            r += "*";
        }
        System.out.println(r);
        display();
    }
    void display () 
    {
        System.out.println("Customer ID: " + getCustomerID());
        System.out.println("Payment ID: " + getPaymentID());
        System.out.println("Previous Due: Rs." + getpreviousDue());
        System.out.println("Remaining Due: Rs." + getBalanceDue());
        System.out.println("CashBack Wallet Balance: Rs." + getCashBack());
        System.out.println();
    }
}
public class AbstractClassesAndMethods
{
    public static void main(String[] args) 
    {
        CreditCardPayment c1 = new CreditCardPayment(10000.23,5001);
        c1.payBill(15000.0);

        CreditCardPayment c2 = new CreditCardPayment(10000.23,5001);
        c2.payBill(0);
        
        ShoppingPayment s1 = new ShoppingPayment(10000.23,5001);
        s1.payBill(5000.00);

        ShoppingPayment s2 = new ShoppingPayment(5000.00,561328);
        s2.payBill(5000.00);

        ShoppingPayment s3 = new ShoppingPayment(5000.00,561328);
        s3.payBill(6000.00);

        ShoppingPayment s4 = new ShoppingPayment(5000.23,561328);
        s4.payBill(4000.00);
    }
}