import java.util.*;
public class Lab2_exercise2
{
    
    public static String[] getSorted(String myArray[])
    {
        int len=myArray.length;
        for(int i = 0; i<len-1; i++) {
         for (int j = i+1; j<len; j++) {
            if(myArray[i].compareTo(myArray[j])>0) {
               String temp = myArray[i];
               myArray[i] = myArray[j];
               myArray[j] = temp;
            }
         }
      }
      
      if(len%2==0)
      {
          for(int i=0;i<len/2;i++)
          {
              String s=myArray[i].toUpperCase();
              myArray[i]=s;
          }
          for(int i=len/2;i<len;i++)
          {
              String s=myArray[i].toLowerCase();
              myArray[i]=s;
          }
      }
      else
      {
          for(int i=0;i<((len/2) + 1);i++)
          {
              String s=myArray[i].toUpperCase();
              myArray[i]=s;
          }
          for(int i=((len/2) + 1);i<len;i++)
          {
              String s=myArray[i].toLowerCase();
              myArray[i]=s;
          }
      }
      
        
        
        return myArray;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
		    s[i]=sc.next();
		}
		
		String[] res=getSorted(s);
		System.out.println("After sorting ");
		for(int i=0;i<res.length;i++)
		{
		    System.out.println(res[i]);
		}
	}
}