package recursion;

public class TowerOfHannoi {
   public static void main(String[] args){
	   int pegCount = 3;
	   move(pegCount,'A','B','C');
   }
   
   public static void move(int n, char source, char destination,char aux){
	   if(n==1){
		   System.out.println("Move from "+source+" to "+destination);
	   }else{
	   move(n-1,source,aux,destination);
	   System.out.println("Move from "+source+" to "+destination);
	   move(n-1,aux,destination,source);
	   }
   }
}
