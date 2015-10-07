package sortingProblems;

public class CountingSortAlgo {
    public static void main(String[] args){
    	//range 1-4 
    	int[] input = {1,3,4,2,3,4,2,1,1,2,3,4,1,2,3,4,2};
    	 sort(input,4);
    }
    
    public static void sort(int input[],int max){
    	int c[] = new int[max+1];
    	int b[] = new int[input.length];
    	
    	for(int i=0;i<=max;i++){
    		c[i] = 0;
    	}
    	
    	for(int x=0;x<input.length;x++){
    		c[input[x]] += 1;
    	}
    	
    	for(int y=1;y<=max;y++){
    		c[y] = c[y]+c[y-1];
    	}
    	
    	for(int j=0;j<input.length;j++){
    		b[c[input[j]]-1] = input[j];
    		c[input[j]] =  c[input[j]] -1;
    	}
    	display(b);
    	
    }
    
    public static void display(int a[]){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    	}
    }
}
