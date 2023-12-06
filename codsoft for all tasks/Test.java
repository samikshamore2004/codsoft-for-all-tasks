import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int amount,num;
       System.out.println("Choose the base currency and the target currency from following:");
       System.out.println("1.USD to Rs");
       System.out.println("2.USD to EUR");
       System.out.println("3.USD to NZD");
       System.out.println();
       System.out.println("4.RS to USD");
       System.out.println("5.RS to EUR");
       System.out.println("6.RS to NZD");
       System.out.println();
       System.out.println("7.EUR to USD");
       System.out.println("8.EUR to RS");
       System.out.println("9.EUR to NZD");
       System.out.println();
       System.out.println("10.NZD to USD");
       System.out.println("11.NZD to RS");
       System.out.println("12.NZD to EUR");
       System.out.println();
       System.out.println("Enter the valid number from above conversion");
       num=sc.nextInt();
       System.out.println("Enter the amount to convert");
       amount=sc.nextInt();
       switch(num)
       {
        case 1: System.out.println("USD:"+amount+" Rs:"+amount*83.31);
        break;
        case 2: System.out.println("USD:"+amount+" EUR:"+amount*0.91);
        break;
        case 3: System.out.println("USD:"+amount+" NZD:"+amount*1.65);
        break;
        case 4: System.out.println("RS:"+amount+" USD:"+amount*0.012);
        break;
       case 5:  System.out.println("RS:"+amount+" EUR:"+amount*0.011);
        break;
        case 6: System.out.println("RS:"+amount+" NZD:"+amount*0.020);
        break;
        case 7: System.out.println("EUR:"+amount+" USD:"+amount*1.09);
        break;
        case 8: System.out.println("EUR:"+amount+" RS:"+amount*91.23);
        break;
        case 9: System.out.println("EUR:"+amount+" NZD:"+amount*1.80);
        break;
        case 10: System.out.println("NZD:"+amount+" USD:"+amount*0.61);
        break;
        case 11: System.out.println("NZD:"+amount+" Rs:"+amount*50.64);
        break;
        case 12: System.out.println("NZD:"+amount+" EUR:"+amount*0.56);
        break;
        default: System.out.println("Invalid number");
    }
}
}