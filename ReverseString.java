import java.io.*;
import java.util.*;

class ReverseString{
	
	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(replaceSpace(s));
		
	}
	
	public static String reverseString(String s){
		String temp = "";
		
		for(int i = s.length() - 1; i >= 0; i--){
			temp += s.charAt(i);
		}
		return temp;
	}
	
	public static String removeDuplicates(String s){
		boolean[] charMap = new boolean[256];
		String temp = "";
		
		for(int i = 0; i < s.length(); i++){
			int val = s.charAt(i);
			
			if(!charMap[val]){
				temp += s.charAt(i);
				charMap[val] = true;
			}
		}
		return temp;
	}
	
	public static String replaceSpace(String s){
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				s = s.substring(0, i) + "%20" + s.substring(i + 1);
				i += 3;
			}
		}
		return s;
	}
		
		
		
		
		
}