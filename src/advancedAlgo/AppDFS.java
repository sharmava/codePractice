package advancedAlgo;

public class AppDFS {
	 public static void main(String[] args){
		 
		   Vertex v1 = new Vertex(1);
		   Vertex v2 = new Vertex(2);
		   Vertex v3 = new Vertex(3);
		   Vertex v4 = new Vertex(4);
		   Vertex v5 = new Vertex(5);
		
		   v1.addVertex(v2);
		   v1.addVertex(v3);
		   v3.addVertex(v4);
		   v4.addVertex(v5);
		   
		   DFS obj = new DFS();
		   obj.dfs(v1);
		  // System.out.println();
		   //obj.dfsRecursive(v1);
		   
	   }
}
