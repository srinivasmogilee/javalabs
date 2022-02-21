import java.util.*;
public class Lab3_exercise2
{
       String st;
       public String getImage(String str)
       {
              StringBuffer sb = new StringBuffer(str);
              sb.append('|');
              StringBuffer sb1 = new StringBuffer(str);
              sb1.reverse();
              sb.append(sb1);
              st = sb.toString();
              return st;
       }
       public static void main(String[] ar)
       {
              Lab3_exercise2 p = new Lab3_exercise2();
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a String");
              String str = s.next();
              System.out.println(p.getImage(str));
       }
}