package array;
import java.util.Scanner;
public class LargestElement {
	public static int[] inputArray(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int largestElement(int arr[]) {
		int n= arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr =inputArray();
		System.out.println(largestElement(arr));

	}

}
