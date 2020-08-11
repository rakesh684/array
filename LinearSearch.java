package array;
import java.util.Scanner;
public class LinearSearch {
	public static int[] inputArray() {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int linearSearch(int arr[]) {
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int i;
		int n=arr.length;
		for( i =0;i<n;i++) {
			if(arr[i]==x) {
			   return i;	
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = inputArray();
       System.out.println(linearSearch(arr));
	}

}
