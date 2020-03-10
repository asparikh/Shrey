import java.util.Scanner;
public class histogram{

int lowerbound
int upperbound
int[] histogram

	public Histogram(int lowerbound, int upperbound) {
		if lowerbound > upperbound {
		int temp = lowerbound;
		lowerbound = upperbound;
		upperbound = temp;
		}
		this.lowerbound = lowerbound;
		this.upperbound = upperbound;
		int range = upperbound - lowerbound;
		int[] histogram = int[range];
	}
	public boolean add(int i) {
		int index = i - lowerbound
		if (index <= histogram.length()) {
			histogram[index] ++1;
			return True
		} else {
			return False;
		}
	}
	public String toString(){
		
	
	}
}