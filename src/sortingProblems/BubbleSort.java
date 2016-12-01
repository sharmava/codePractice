package sortingProblems;

public class BubbleSort {
     public static int[] sort(int[] input){
    	 if(input.length > 0){
    		 boolean isSwap = true;
    		 for(int x=0;x<input.length-1 && isSwap;x++){
    			 isSwap = false;
    			 for(int y=0;y<input.length-1-x;y++){
    				 if(input[y] > input[y+1]){
    					 int temp = input[y];
    					 input[y] = input[y+1];
    					 input[y+1] = temp;
    					 isSwap = true;
    				 }
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
