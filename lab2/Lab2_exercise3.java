import java.util.*;
class Lab2_exercise3{

public static int[] getSorted(int array[])
{
	 for(int i=0;i<array.length;i++)
	{
	 	for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			}
		}
	}
 	 System.out.println("original array :");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
		System.out.println();
   	
	System.out.println("reverse array :");
        for(int i=array.length-1;i>=0;i--)
	{
	 	System.out.print(array[i]+" ");
 
         }

return array;
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
		
		System.out.println(getSorted(array));


 }

}