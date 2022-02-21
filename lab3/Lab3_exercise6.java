import java.util.Arrays;

public class Lab3_exercise6{

	public static void main(String[] args) {

		String str = "ant";
		if (order(str)) {
			System.out.println("String is in alphabetical order and the string is" + str);
		} else {
			System.out.println("String is not in alphabetical order");
		}
	}

	static boolean order(String str) {
		int size = str.length();
		char[] chArray = new char[size];
		for (int i = 0; i < size; i++) {
			chArray[i] = str.charAt(i);
		}

		Arrays.sort(chArray);
		for (int i = 0; i < size; i++) {
			if (chArray[i] != str.charAt(i)) {

				return false;
			}
		}
		return true;
	}
}

