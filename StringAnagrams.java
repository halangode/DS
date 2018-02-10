import java.io.*;
import java.util.*;


class StringAnagrams{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		boolean flag = checkAnagram(s, t);
		
		System.out.println(flag);
		
	}
	
	public static boolean checkAnagram(String s, String t){
		
		if(s.length()!= t.length()){
			return false;
		} 
		else{
			if(s.equals(t)){
				return true;
			} 
			else{
			
				int sumS = 0;
				int sumT = 0;
			
				for(int i = 0; i < s.length(); i++){
					sumS += (int) s.charAt(i);
					sumT += (int) t.charAt(i);
				}
				
				if(sumS == sumT){
					return true;
				}
				else{
					return false;
				}
			}		
		
		}
	
	}

	
}
