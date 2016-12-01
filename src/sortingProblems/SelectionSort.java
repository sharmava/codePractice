package sortingProblems;

public class SelectionSort {
   public static int[] sort(int[] input){
	   if(input.length > 0){
		   for(int x=0;x<input.length;x++){
			   int smallestIndex  = x;
			   for(int y=x+1;y<input.length;y++){
				   if(input[smallestIndex] > input[y]){
					   smallestIndex = y;
				   }
			   }
			   
			   if(smallestIndex != x){
				   int temp = input[x];
				   input[x] = input[smallestIndex];
				   input[smallestIndex] = temp;
			   }
		   }
	   }
	   return input;
   }
   
   
   public static void main(String[] args){
  	 int[]input = {5,3,2,7,8,9,1,2,3,10,5,6,7,8};
  	 display(sort(input));
   }
   
   public static void display(int[] data){
  	 for(int i=0;i<data.length;i++){
  		 System.out.print(" "+data[i]);
  	 }
   }
}
