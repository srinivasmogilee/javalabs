import java.util.*;
public class Lab5_exercise1 
{

	public static void main(String[] args) 
	{
		 
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = s.nextInt();
		  
		  try
		  {
		   if(age < 18) 
		    throw new AgeException();
		   else
		    System.out.println("you are eligible vote");
		  }
		  catch (AgeException a) 
		  {
		   System.out.println(" you are not eligible");
		 
		 }

	}

}