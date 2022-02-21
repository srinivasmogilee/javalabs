import java.util.*;
class Ex5{

public static int calculateSum(int n)
{
 int sum=0;
         for(int i=1;i<=n;i++)
         {
            if(i%5==0 || i%3==0)
            sum+=i;
         }
 return sum;
}
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
      int int1=sc.nextInt();
      
      int result=calculateSum(int1);
      System.out.print("Sum :"+result);
                                       }
}