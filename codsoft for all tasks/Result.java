import java.util.*;
class Result
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int maths,chem,bio,phy,eng,total;
        System.out.println("Enter marks in following subjects: Maths, Chemestry,Bio,Physics, English");
        maths=sc.nextInt();
        chem=sc.nextInt();
        bio=sc.nextInt();
        phy=sc.nextInt();
        eng=sc.nextInt();
        total=maths+chem+bio+phy+eng;
        double avg_per=total/5;
        System.out.println("Total marks:"+total);
        System.out.println("Average percentage:"+avg_per);
        if(avg_per>=80 && avg_per<=100)
        {
            
        System.out.println("Grade:A");
        }
        else if(avg_per<80 && avg_per>=70)
        {
            System.out.println("Grade:B");
        }
        else if(avg_per<70 && avg_per>=60)
        {
            System.out.println("Grade:C");
        }
        else if(avg_per<60 && avg_per>=50)
        {
            System.out.println("Grade:D");
        }
        else if(avg_per<50 && avg_per>=40)
        {
            System.out.println("Grade:E");
        }
        else{
            System.out.println("Grade:F");
        }
    }
}