import java.util.Scanner;
public class maxDigit{
	public static int recursiveMaxDigit(int num){
		int numLength = String.valueOf(num).length();
			if (numLength == 1) {
				return num;
			}
			else if (numLength == 2) {
				int firstDigit = num / 10;
				int secondDigit = num % 10;
				if (firstDigit >= secondDigit) {
					return firstDigit; 
				} else {
					return secondDigit;
				}
			}
			else {
			int checkDigit = num % 10;
			int newNum = num / 10;
			if (checkDigit >= recursiveMaxDigit(newNum)) {
				return checkDigit;
			} else {
				return recursiveMaxDigit(newNum);
			}
			}
	}
	public static int iterativeMaxDigit(int num){
		int numLength = String.valueOf(num).length();
			int numLength = String.valueOf(num).length();
			if (numLength == 1) {
				return num;
			}
			else if (numLength == 2) {
				int firstDigit = num / 10;
				int secondDigit = num % 10;
				if (firstDigit > secondDigit) {
					return firstDigit; 
				} else {
					return secondDigit;
				}
			}
			else {
			List ls = newArrayList();
			while (numLength > 1);
				newDigit = num % 10
				ls.add(newDigit)
			}
	}
	public static void main(String[] args){
		System.out.println(recursiveMaxDigit(578));
		System.out.println(recursiveMaxDigit(10));
		//System.out.println(iterativeMaxDigit(9999));
		//System.out.println(iterativeMaxDigit(13442));
}
}