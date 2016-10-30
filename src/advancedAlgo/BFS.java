package advancedAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
     public void bfs(Vertex root){
    	 if(root == null){
    		 System.out.println("No data");
    	 }
    	 
    	 Queue<Vertex> q = new LinkedList<Vertex>();
    	 root.setVisited(true);
    	 q.add(root);
    	 
    	 while(!q.isEmpty()){
    		 Vertex o = q.remove();
    		 System.out.println(o.getData());
    		 for(Vertex v : o.getAdjList()){
    			 if(!v.isVisited()){
    				 q.add(v);
    			 }
    		 }
    	 }
     }
}
