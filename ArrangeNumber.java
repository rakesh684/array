//arrange number as for input 6(1,3,5,4,2)
package array;
import java.util.Scanner;
public class ArrangeNumber {
	public static int[] arrangeArray(int n) {
		int arr [] =new int[n];
		int i=0 , j=n-1 , num =1;
		while(i<j) {
			arr[i]=num;
			num++;
			i++;
			arr[j]=num;
			num++;
			j--;
		}
		if(i==j) {
			arr[i]=num;
		}
		return arr;
	
		
	}
	
	public static void printArray(int arr[]) {
		int n=arr.length;
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {

		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=arrangeArray(n);
	    printArray(arr);

	}

}
