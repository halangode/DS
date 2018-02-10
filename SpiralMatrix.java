import java.io.*;
import java.util.*;

public class SpiralMatrix {
	
	public static void main(String[] arg){
		System.out.println(generateMatrix(3));
	}
	public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
	    int[][] array = new int[a][a];
	    
	    int value = 1;
	    int nSquare = a * a;
	    
	    int i = 0; 
	    int j = 0;
	    while(value <= nSquare){
	        while(j < a && array[i][j] == 0 && value <= nSquare){
	            array[i][j] = value++;
	            j++;
	        }
	        j--;
	        i++;
	        while(i < a && array[i][j] == 0 && value <= nSquare){
	            array[i][j] = value++;
	            i++;
	        }
	        i--;
	        j--;

	        while(j >= 0 && array[i][j] == 0 && value <= nSquare){
	            array[i][j] = value++;
	            j--;
	        }
	        j++;
	        i--;
	        while(i >= 0 && array[i][j] == 0 && value <= nSquare){
	            array[i][j] = value++;
	            i--;
	        }
	        i++;
	        j++;
	    }
	    
	    
	    ArrayList<ArrayList<Integer>> result = convert(array, a);
        
	    return result;
	}
	
	public static ArrayList<ArrayList<Integer>> convert(int[][] a, int n){
	    ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
	    
	    for(int i = 0; i < n; i++){
	        arrayList.add(new ArrayList<Integer>());
	    }
	    
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            arrayList.get(i).add(a[i][j]);
	        }
	    }
	    
	    return arrayList;
	}
}
