import java.util.*;
class Lab2_exercise1{

public static int getSecondSmallest(int array[],int size)
{
	 for(int i=0;i<size;i++)
	{
	 	for(int j=i+1;j<size;j++)
		{
			if(array[i]>array[j])
			{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			}
		}
	}
	for(int i=0;i<size;i++)
	{
		System.out.print(array[i]+" ");
	}
		System.out.println();
return array[1];
}
 public static void main(String[] args)
 {
  	 Scanner sc=new Scanner(System.in);
      	 
	 int size=sc.nextInt();
   	 
	 int[] array=new int[size];
	
	 for(int i=0;i<size;i++)
	{
		array[i]=sc.nextInt();
	}
		System.out.println("-------------------------------");
		
		System.out.println("second smallest number is :"+getSecondSmallest(array,size));

 }

}