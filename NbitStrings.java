import java.io.*;
import java.util.*;

class NbitStrings{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] combinations = new int[n];
		
		generate(combinations, n);
	}
	
	public static void generate(int[] arr, int n){
		if(n < 1){
			System.out.println("\n");
			for(int a : arr){
				System.out.print(a);
			}
			
		}
		else{
			arr[n - 1] = 0;
			generate(arr, n - 1);
			arr[n - 1] = 1;
			generate(arr, n - 1);
		}
	}
		
}