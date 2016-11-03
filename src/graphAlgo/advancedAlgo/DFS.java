package graphAlgo.advancedAlgo;

import java.util.Stack;

public class DFS {
 public void dfs(Vertex root){
	 if(root == null){
		 System.out.println("No data");
	 }
	 
	 Stack<Vertex> stk = new Stack<Vertex>();
	 stk.add(root);
	
	 
	 while(!stk.isEmpty()){
		 Vertex t = stk.pop();
		 System.out.println(t.getData());
		 t.setVisited(true);
		 
		 for(Vertex v : t.getAdjList()){
			 if(!v.isVisited()){
				 stk.push(v);
			 }
		 }
	 }
	 
 }
 
 public void dfsRecursive(Vertex v){
	 if(v == null){
		 return;
	 }
	 
	  System.out.println(v.getData());
	  
	  for(Vertex x : v.getAdjList()){
		  if(!x.isVisited()){
			  x.setVisited(true);
			  dfsRecursive(x);
		  }
	  }
 }
}
