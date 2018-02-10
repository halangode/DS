import java.io.*;
import java.util.*;

class MergeSort{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr, 0, arr.length - 1);
		
		
		printArr(arr);
	}
	
	public static void mergeSort(int[] arr, int start, int end){
		if(start == end){
			return;
		}
		
		int mid = (start + end)/2;
		
		
		mergeSort(arr, start, mid);
		mergeSort(arr,mid + 1, end);
		merge(arr, start, mid, end);
	}
	
	public static void merge(int[] arr, int start, int mid, int end){
		int index1 = start;
		int index2 = mid + 1;
		int[] newArr = new int[(end - start) + 1];
		int newIndex = 0;
		while(index1 <= mid && index2 <= end){
			if(arr[index1] < arr[index2]){
				newArr[newIndex++] = arr[index1++];
			}
			else if(arr[index1] > arr[index2]){
				newArr[newIndex++] = arr[index2++];
			}
			else{
				newArr[newIndex++] = arr[index1++];
				newArr[newIndex++] = arr[index2++];
			}	
		}
		
		if(index1 <= mid && index2 > end){
			while(index1 <= mid){
				newArr[newIndex++] = arr[index1++];
			}
		}
		else if(index2 <= end && index1 > mid){
			while(index2 <= end){
				newArr[newIndex++] = arr[index2++];
			}
		}
						
		for(int i = start, j = 0; i <= end; i++, j++){
			arr[i] = newArr[j];
		}	
	}
	
	public static void printArr(int[] arr){
		System.out.println("Printing array...");
		for(int i : arr){
			System.out.print(i + " ");
		}
		
		System.out.println("");
	}
		
}
