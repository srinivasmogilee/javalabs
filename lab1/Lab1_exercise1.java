
import java.util.*;
 
public class Lab1_exercise1 {
     
    public static void main(String[] args) {
      
        int n=23;
        
       
        if(n<0){
            System.out.println("n cannot take negative values");
            return;
        }
        double sum = Math.pow(n*(n+1)/2,2);
        System.out.println("The sum of first " + n + " cube numbers is " + sum);
    }
}