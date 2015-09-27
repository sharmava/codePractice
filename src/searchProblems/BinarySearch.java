package searchProblems;

public class BinarySearch {
    public static boolean isElementPresent(int[] input,int item){
    	int low=0;
    	int high = input.length-1;
    	int mid;
    	while(low<=high){
    		mid = (high-low)/2;
    		if(item > input[mid]){
    			low = mid+1;
    		}else if(item < input[mid]){
    			high = mid-1;
    		}else if(item == input[mid]){
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean isElementPresentRecursive(int[] input,int item,int low, int high){
    	int mid = (high+low)/2;
    	if(low>high){
    		return false;
    	}
    	else if(input[mid] == item){
    		return true;
    	}else if( input[mid] < item){
    		return isElementPresentRecursive(input, item, mid+1, high);
    	}else {
    		return isElementPresentRecursive(input, item, low, mid-1);
    	}    	
    }
    
    public static void main(String[] args){
    	int input[] = {1,2,3,4,5,6,7,8,9};
    	int searchItem = 1;
    	System.out.println(isElementPresent(input, searchItem));
    	System.out.println(isElementPresentRecursive(input, searchItem,0,input.length-1));
    }
}
