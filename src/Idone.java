import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone {

	public static void main(String[] args) throws java.lang.Exception {
		
		String string = "01010101010101010101";
		String result = truncateStringLeft(string, 10);
		System.out.println("Ckermi kristo");
		System.out.println(result);

	}

	public static String truncateStringLeft(String string, int length) {

		char[] stringArray = string.toCharArray();
		char[] finalStringArray = new char[length];

		int j = stringArray.length-1;
		for (int i = length-1; i >= 0; i--) {
			finalStringArray[i] = stringArray[j];
			j--;
		}

		return new String(finalStringArray);
	}

	public static String addBinary(String a, String b) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int la = a.length();
		int lb = b.length();

		int max = Math.max(la, lb);

		StringBuilder sum = new StringBuilder("");
		int carry = 0;

		for (int i = 0; i < max; i++) {
			int m = getBit(a, la - i - 1);
			int n = getBit(b, lb - i - 1);
			int add = m + n + carry;
			sum.append(add % 2);
			carry = add / 2;
		}

		if (carry == 1)
			sum.append("1");

		return sum.reverse().toString();

	}

	public static int getBit(String s, int index) {
		if (index < 0 || index >= s.length())
			return 0;

		if (s.charAt(index) == '0')
			return 0;
		else
			return 1;

	}

	public static char[] leftRotate(char[] charArray, int rotateStep) {
		char[] result = new char[charArray.length];

		int count = 0;
		for (int i = rotateStep; i < charArray.length; i++) {
			result[count] = charArray[i];
			count++;
		}

		for (int j = 0; j < rotateStep; j++) {
			result[count] = charArray[j];
			count++;
		}

		return result;
	}
}