import java.io.*;
import java.util.*;


public class Fib{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(computeFib(n));
	}
	
	public static long computeFib(int n){
		HashMap<Integer, Long> map= new HashMap<>();
		
		return fib(n, map);
	}
	
	public static long fib(int n, HashMap<Integer, Long> map){
		if(n == 0){
			return 0;
		}
		
		if(n == 1){
			return 1;
		}
		
		else if(map.containsKey(n)){
			return map.get(n);
		}
		else{
			long fibNum = fib(n - 1, map) + fib(n - 2, map);
			map.put(n, fibNum);
			return fibNum;
		}
	}

}