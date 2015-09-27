package searchProblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
	private static Map<Integer,Integer> elementMap = new HashMap<Integer,Integer>();
	
    public static void main(String[] args){
    	int[] input = {1,2,3,4,5,1};
    	if(!isDuplicatePresent(input)){
    		System.out.println("No duplicate items present");
    	}else{
    		System.out.println("Duplicate items present");
    	}
    }
    
    public static boolean isDuplicatePresent(int[] input){
    	for(int i=0;i<input.length;i++){
    		if(elementMap.get(input[i]) != null){
    			return true;
    		}else{
    			elementMap.put(input[i], input[i]);
    		}
    	}
    	return false;
    }
}
