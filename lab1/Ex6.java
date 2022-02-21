import java.util.*;
class Ex6{

public static int calculateDifference(int n)
{
int sum=0;
int sumsqre=0;
	for(int i=1;i<=n;i++)
	{
		sumsqre+=(int)Math.pow(i,2);

		sum+=i;
	}
return sumsqre-(int)Math.pow(sum,2);
}
public static void main(String[] args){
	int int1=6;
	int result=calculateDifference(int1);
	System.out.print("Sumsqre :"+result);
}
}