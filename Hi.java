//1-2+3-4+5-6+7 = (i-(i+1)) 
//


import java.util.*;
public class Hi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= a; i++)
        {
            if(i%2 == 0)
            {
                sum = sum - i;
            }
            else
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    
}











//