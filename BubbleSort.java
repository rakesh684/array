package array;
import java.util.Scanner;
public class BubbleSort {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr =new int[n];
//		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int []arr =takeInput();
		printArray(arr);
	}
}
