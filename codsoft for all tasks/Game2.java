import java.util.*;
class Game2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=12,b=65,m,n;
        System.out.println("Round1, No of attempt:5.NOTE:NUMBER RANGE :1-100 ");
        for(int i=1;i<=5 ;i++)
        {
       System.out.println("Enter the number to guess the original number");
         m=sc.nextInt();
         if(m>=1 && m<=10)
         {
           System.out.println("Close to the gussing number, keep trying");
           continue;
         }
         else if(m==a)
         {
            System.out.println("Your guessing is CORRECT, you WON, CONGRATULATIONS.Be ready for next round ");
           System.out.println("HEY WINNER, WELCOME TO THE NEXT ROUND. Round-2");
       System.out.println("Note: No of attempts:3, NUMBER RANGE: 50-100");
       for(int j=1;j<=3;j++)
       {
        System.out.println("Enter the number");
        n=sc.nextInt();
        if(n==b)
        {
            System.out.println("YOU WON THE FINAL ROUND, CONGRATULATIONS.");
            break;
        }
        else if(n>=50 && n<=70)
        {
            System.out.println("You are in between the number,let's try again.");
            continue;
        }
        else if(n>70 && n<=100)
        {
            System.out.println("You are away from the target.");
            continue;
        }
        else
        {
            System.out.println("Invalid number");
            continue;
        }
       }
       System.out.println("Limit over");
        break;
         }
        else if(m>10 && m<=30)
        {
            System.out.println("You are in between the guessing number,give your best");
            continue;
        }
        else if(m>30 && m<=70)
        {
            System.out.println("You are away from the number.Try again");
            continue;
        }
        else{
            System.out.println("You are so away from the number.Keep trying.");
            continue;
        }
        }  
       System.out.println("Limit over.");
       
    }
}