package stringProblems;

public class ReverseSentenceWords {
	public static void main(String[] args){
       System.out.println(reverseSentenceWords("falcon is varun sharma"));		
	}
	
     public static String reverseSentenceWords(String input){
    	 if(input!=null){
    		 String[] data = input.split(" ");
    		 if(data.length > 1){
    			 StringBuffer result = new StringBuffer();
    			 for(int i=0;i<data.length;i++){
    				 data[i] = reverseString(data[i]);
    				 result.append(data[i]+" ");
    			 }
    			 return result.toString();
    		 }else {
    			 return input;
    		 }
    	 }
    	return input; 
     }
     
     public static String reverseString(String input){
 		if(input != null && input.length() > 1){
 		char[] inputArray = input.toCharArray();
 		int length = inputArray.length;
 		for(int i=0;i<length/2;i++){
 	     char temp = inputArray[i];
 	     inputArray[i] = inputArray[length - i - 1];
 	     inputArray[length - i - 1] = temp;
 		}
 		 return new String(inputArray);
 		}else{
 		 return input;
 		}
 	}
} 
