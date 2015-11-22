package stringProblems;

public class ReverseStringBuffer {
	public static void main(String[] args){
		StringBuffer input = new StringBuffer("Kya be");
		input = reverseStringWithBuffer(input);
	    System.out.println(input.toString());
	}
    public static StringBuffer reverseStringWithBuffer(StringBuffer input){
    	if(input != null && input.length() > 1){
    		int length = input.length();
    		StringBuffer inputRev = new StringBuffer();
    	 	for(int i=length-1;i>=0;i--){
    	    inputRev.append(input.charAt(i));    
    		}
    	  return inputRev;
    	}
    	return input;
    }
}
