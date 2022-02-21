import java.util.*;
class Lab3_exercise1
{
   public static void main(String args[])
        {
           Scanner sc=new Scanner(System.in);
           
            String digit=sc.nextLine();
            StringTokenizer token=new StringTokenizer(digit);
            int d=0,s=0;
            System.out.println("\nEntered integers are : ");
            while(token.hasMoreTokens())
           {
            String st=token.nextToken();
            d=Integer.parseInt(st);
            System.out.print(d+" ");
            s+=d;
            }
    System.out.println();
    System.out.println("Sum is : "+s);
  }
}