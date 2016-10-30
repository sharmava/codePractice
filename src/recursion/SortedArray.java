package recursion;

public class SortedArray {
   public static void main(String[] args){
	   int input[] = {1,2,3,4,5,0};
	   System.out.print(logic(input.length-1,input));
   }
   
  static boolean logic(int n, int[] input){
	  
	 if(n==0){
		 return true;
	 }else{
		 if(input[n] < input[n-1]){
			return false;
		 }else{
			return logic(n-1,input);
		 }
	 }
	 
  }
}
