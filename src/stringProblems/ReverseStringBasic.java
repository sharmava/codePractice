package stringProblems;

public class ReverseStringBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(reverseString("Varun"));
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
