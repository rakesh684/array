package array;
import java.util.Scanner;
public class SumOfArray {
	public static int[] sum() {
		Scanner s =new Scanner(System.in);
		int n= s.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
    
	public static int printArray(int[] arr) {
		int n=arr.length;
		int sum =0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = sum();
		System.out.println(printArray(arr));

	}

}
