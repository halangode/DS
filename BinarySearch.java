import java.io.*;
import java.util.*;

class BinarySearch
{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++){
			array[i] = in.nextInt();
		}
		
		int element = in.nextInt();
		System.out.println(binarySearch(0, n - 1, array, element));
	}
	
	public static int binarySearch(int start, int end, int[] array, int element){
		int mid = (start + end)/2;
		
		if( start > end){
			return -1;
		}
		
		if(element == array[mid]){
			return mid;
		}
		
		else if(element < array[mid]){
			return binarySearch(0, mid - 1, array, element);
		}
		else {
			return binarySearch(mid + 1, end, array, element);
		}	
	}
}
