import java.util.*;
import java.lang.*;
import java.io.*;

class MaxProdSubArray {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int i = 0; i < test; i++){
		    int n = sc.nextInt();
		    long k = sc.nextLong();
		    int[] arr = new int[n];
		    
		    for(int j = 0; j < n; j++){
		        arr[j] = sc.nextInt();
		    }
		    
		    System.out.println(maxSubArray(arr, k));
		    
		}
	}
	
	public static int maxSubArray(int[] arr, long k){
	    int start = 0; 
	    int end = 0;
	    long prod = 1;
	    int count = 0;
	    int len = arr.length;
	    
	    while(start < len && end < len){
	        //System.out.println("Bstart: " + start + " end: " + end + " prod: " + prod + " count: " + count);

	        while(end < len){
	            prod *= arr[end];
	            if(prod < k){
	                count += (end - start) + 1;
	                if(end == len - 1){
	                    return count;
	                }
	                end++;
	            }
	            else{
	                break;
	            }
	        }
	        
	        //System.out.println("Ustart: " + start + " end: " + end + " prod: " + prod + " count: " + count);
	        
	        while(start <= end && start < len){
	            if(prod >= k){
	                prod /= arr[start++];
	            }
	            else{
	                break;
	            }
	        }
	        if(prod < k){
	           count += end - start + 1;
	        }
	        //System.out.println("Dstart: " + start + " end: " + end + " prod: " + prod + " count: " + count);
            end++;
	    }
	    
	    return count;
	}
}