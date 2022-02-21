import java.util.*;
class Lab2_exercise4{
public static int getSorted(int arr[]){  
        
	for(int i=0;i<arr.length;i++)
	{
	 	for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
			int tem=arr[i];
			arr[i]=arr[j];
			arr[j]=tem;
			}
		}
	}
	System.out.println("sorted array :");
	for(int i=0;i<arr.length;i++)
	{ 
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("original array :");
        int[] temp = new int[arr.length];  
        int j = 0;  
        for (int i=0; i<arr.length-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[arr.length-1];     
        // Changing original array  

        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  

return j;
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
		int length=getSorted(array);
		 
        for (int i=0; i<length; i++)  {
           System.out.print(array[i]+" "); 
}
 }

}