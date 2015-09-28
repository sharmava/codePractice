package searchProblems;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatingNumber {
	private static Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
	
    public static void main(String[] args){
    	 int[] input = {1,1,2,2,2,3,3,3,3,1,1,1,3,3,3,3,3};
    	 System.out.println(mostRepeat(input));
    }
    
    public static int mostRepeat(int[] input){
    	int mostRepeatingCountVal = 0;
    	int mostRepeatingVal = input[0];
    	
    	for(int x=0;x<input.length;x++){
    		if(countMap.get(input[x])!=null){
    			int count = countMap.get(input[x]);
    			countMap.put(input[x], ++count);
    		}else{
    			countMap.put(input[x], 1);
    		}
    	}
    	
    	for(Map.Entry<Integer,Integer> entryObj : countMap.entrySet()){
    		 if(entryObj.getValue() > mostRepeatingCountVal){
    			 mostRepeatingVal = entryObj.getKey();
    			 mostRepeatingCountVal = entryObj.getValue();
    		 }
    	}
    	
    	
    	return mostRepeatingVal;
    }
}
