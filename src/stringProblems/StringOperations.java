package stringProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations {
	public static List<String> getAllPrefixes(String input) {
		List<String> result = new ArrayList<String>();
		int length = input.length();
		if (input != null) {
			for (int x = 0; x <= length; x++) {
				String temp = input.substring(0, x);
				result.add(temp);
			}
		}
		return result;
	}

	public static List<String> getAllSuffixes(String input) {
		List<String> result = new ArrayList<String>();
		int length = input.length();
		if (input != null) {
			for (int x = 0; x < length; x++) {
				String temp = input.substring(x, length);
				result.add(temp);
			}
		}
		return result;
	}
	
	public static String reverseString(String input){
		if(input != null){
			char[] arr = input.toCharArray();
			for(int x=0;x<arr.length/2;x++){
				char temp = arr[x];
				arr[x] = arr[arr.length - x -1];
				arr[arr.length - x -1] = temp;
			}
			input = new String(arr);
		}
		return input;
	}
	
	public static String longestPrefix(String text1,String text2){
		if(text1 != null && text2 != null){
			int length = Math.min(text1.length(), text2.length());
			for(int x=0;x<length;x++){
				if(text1.charAt(x) != text2.charAt(x)){
					return text1.substring(0,x);
				}
			}
			return text1.substring(0,length);
		}
		
		return null;
	}
	
	public static String longestSubString(String input){
		if(input != null){
			List<String> lst = getAllSuffixes(input);
			Collections.sort(lst);
			
			String result = "";
			
			int length = input.length();
			
			for(int x=0;x<length-1;x++){
				String temp = longestPrefix(lst.get(x), lst.get(x+1));
				if(temp.length() > result.length()){
                  result = temp;					
				}
			}
			
			return result;
		}
		return null;
	}
}
