package sortingProblems;

public class QuickSort {
   private int numbers[];
   private int number;
   
   public static void main(String[] args){
	   int[] data = {2,3,4,6,1,2,3,4,1,2,3,9,7,0,9,0};
	   QuickSort obj = new QuickSort();
	   data = obj.sort(data);
	   display(data);
   }
   
   public int[] sort(int[] values){
	   this.numbers = values;
	   int number = values.length;
	   quicksort(0,number-1);
	   return this.numbers;
   }
   
   public void quicksort(int low,int high){
	   int i=low,j=high;
	   int pivot = this.numbers[(low+high)/2];
	   
	   while(i<=j){
		   
		   while(this.numbers[i] < pivot){
			   i++;
		   }
		   
		   while(this.numbers[j] > pivot){
			   j--;
		   }
		   
		   if(i <= j){
			   exchange(i,j);
			   i++;
			   j--;
		   }
		   
		   if(i<high){
			   quicksort(i,high);
		   }
		   if(j>low){
			   quicksort(low,j);
		   }
	   }
   }
   
   public void exchange(int i, int j){
	   int temp = this.numbers[i];
	   this.numbers[i] = this.numbers[j];
	   this.numbers[j] = temp;
   }
   
   public static void display(int[] input){
	   for(int i=0;i<input.length;i++){
		   System.out.print(input[i]+" ");
	   }
	   System.out.println();
   }
}
