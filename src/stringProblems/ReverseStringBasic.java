package stringProblems;

public class ReverseStringBasic {
   
	public static void main(String[] args){
		String input = "Varun Sharma";
		System.out.println("Input :"+input+ "  Reverse :"+reverseString(input));
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
}
