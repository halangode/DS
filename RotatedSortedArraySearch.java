import java.io.*;
import java.util.*;

class RotatedSortedArraySearch{
	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		int element = sc.nextInt();
		
		System.out.println(findElement(element, array));
	
	}
	
	public static int findPivot(int start, int end, int[] array){
		if(start > end){
			return -1;
		}
		int mid = (start + end)/2;
		
		if(array[mid] > array[mid + 1]){
			return mid;
		}
		
		else if(array[start] > array[mid]){
			return findPivot(start, mid - 1, array);
		}
		else if(array[mid] > array[end]){
			return findPivot(mid + 1, end, array);
		}
		return -1;
	}
	
	public static int findElement(int element, int[] array){
		int start = 0;
		int end = array.length - 1;
		if(array[start] < array[end]){
			return binarySearch(start, end, array, element);
		}
		
		else{
			int pivot = findPivot(0, array.length - 1, array);
			if(element == array[pivot]){
				return pivot;
			}
			else if(element > array[0] && element < array[pivot]){
				return binarySearch(0, pivot, array, element);
			}
			else {
				return binarySearch(pivot + 1, array.length - 1, array, element);
			}
		}
	}
	
	public static int binarySearch(int start, int end, int[] array, int element){
		
		if(start > end){
			return -1;
		}
		int mid = (start + end)/2;
		
		if(element == array[mid]){
			return mid;
		}
		
		else if( element < array[mid]){
			return binarySearch(start, mid - 1, array, element);
		}
		else {
			return binarySearch(mid + 1, end, array, element);
		}
	}
}