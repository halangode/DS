import java.io.*;
import java.util.*;

class PascalTriangle{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		
		for(int i = 0; i <= inp; i++){
			System.out.print(getPascalRow(inp, i) + " ");
		}
	}
	
	public static int getPascalRow(int n, int k){
		
		if(n == 1){
			return 1;
		}
		
		else if(k == 0 || k == n){
			return 1;
		}
		
		else{
			return getPascalRow(n - 1, k) + getPascalRow(n - 1, k - 1);
		}
	}
	
}