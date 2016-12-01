package sortingProblems;

public class QuickSort {
     public static int[] sort(int[]arr, int low,int high){
    	 
    	 if(low <= high){
    		 int pivot = partition(arr,low,high);
             sort(arr,low,pivot-1);
             sort(arr,pivot+1,high);
    	 }
    	 
    	 return arr;
     }
     
     public static int partition(int[] arr, int low, int high){
    	 int pivotIndex = (low+high)/2;
    	 int i= low;
    	 swap(arr,high,pivotIndex);
    	 
    	 for(int j=low; j< high;j++){
    		 if(arr[j] < arr[high]){
    			 swap(arr,i,j);
    			 i++;
    		 }
    	 }
    	 swap(arr,i,high);
    	 
    	 return i;
     }
     
     public static void swap(int arr[],int x, int y){
    	 int temp = arr[x];
    	 arr[x] = arr[y];
    	 arr[y] = temp;
     }
     
     public static void display(int[] data){
    	 for(int i=0;i<data.length;i++){
    		 System.out.print(" "+data[i]);
    	 }
     }
     
     public static void main(String[] args){
    	 int[] input = {2,1,3,4,2,3,1,1,7,8,9,5,4,3,6,7,1,2};
    	 display(sort(input,0,input.length-1));
     }
}
