import java.util.*;
class Lab3_exercise4 
{

	public static int modifyNumber(int n) {
		StringBuffer sb = new StringBuffer();
		String str = Integer.toString(n);
		for (int i = 0; i < str.length() - 1; i++) {
			int difference = (int) (str.charAt(i) - str.charAt(i + 1));
			sb.append(Math.abs(difference));
		}
		sb.append((int) Math.abs(str.charAt(str.length() - 1) - str.charAt(0)));
		return Integer.parseInt(sb.toString());

	}

	public static void main(String[] args) {
		int s=2385784;
		System.out.println(modifyNumber(s));
	}

}