import java.util.Scanner;
public class lab3copy{
	public static int fibonacciRecursive(int n){
	if (n < 0) {
	return -1;
	}
	else if (n == 0) {
	return 0;
	}
	else if (n == 1) {
	return 1;
	}
	else {
	return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
}
public static void main(String[] args){
System.out.println(fibonacciRecursive(3));
System.out.println(fibonacciRecursive(5));
System.out.println(fibonacciRecursive(8));
System.out.println(fibonacciRecursive(10));
System.out.println("Enter a number");
Scanner s = new Scanner(System.in);
int input = s.nextInt();
System.out.println(fibonacciRecursive(input));
}
}