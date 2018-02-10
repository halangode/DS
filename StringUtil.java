import java.io.*;
import java.util.*;

public class StringUtil{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String val = sc.next();
		
		System.out.println(longestCharSeq(val));
	
	}
	
	public static String longestCharSeq(String val){
		
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 1;
		for(int i = 0; i < val.length(); i++){
			if((i + 1) < val.length()
				&& val.charAt(i) == val.charAt(i + 1){
					count++;
				}
				else {
					map.put(val.charAt(i - 1), count);
					count = 1;
				}
		}
		
	}
}