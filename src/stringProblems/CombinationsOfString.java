package stringProblems;

public class CombinationsOfString {
    
	public static void main(String[] args){
	   combinations("","abc");	
	}
	
	public static void combinations(String prefix,String str){
	   if(str.length() > 0){
		   System.out.println(prefix + str.charAt(0));
		   combinations(prefix+str.charAt(0), str.substring(1));
		   combinations(prefix, str.substring(1));
	   }
   }
}
