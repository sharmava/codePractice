package stringProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffixesString {
    public static List<String> getAllSuffixes(String input){
          List<String> result = new ArrayList<String>();
          int length = input.length();
          if(input != null){
        	  for(int x=0;x<length;x++){
        		  String temp = input.substring(x,length);
        		  result.add(temp);
        	  }
          }
          return result;
    }
    
    public static void main(String[] args){
    	String input = "Varun";
    	List<String> result = getAllSuffixes(input);
    	Collections.sort(result);
    	for(String x : result){
    		System.out.println(x);
    	}
    	
    }
}
