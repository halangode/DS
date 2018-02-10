import java.io.*;
import java.util.*;

public class NumLiterals{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(literal(n));
		
	}
	
	public static String literal(int n){
		String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		String[] tenTwenties = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		String[] tenPow = {"ten", "hundred", "thousand", "million"};
		
		StringBuilder literal = new StringBuilder();
		
		int temp = n;
		
		int count = getCount(n);
		
		while(true){
			
			if(count == 1){
				literal.append(ones[temp]);
				return literal.toString();
			}
			
			else if(count == 2){
				if(n >= 10 && n < 20){
					literal.append(tenTwenties[n - 10]);
					return literal.toString();
				}
				
				else if(n >= 20){
					int t = n/10;
					int s = n%10;
				    literal.append(tens[t - 1] + " ");
					
					if(s != 0){
						literal.append(ones[s]);
					}
					return literal.toString();
				}
			}
		}
			
			
	}
	
	public static int getCount(int n){
		int count = 0;
		
		while(n > 0){
			count++;
			n /= 10;
		}
		return count;
	}
	
}
