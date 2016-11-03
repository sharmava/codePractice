package graphAlgo.advancedAlgo.topologicalOrdering.copy;

import java.util.Stack;

public class TopologicalOrdering {
	private Stack<Vertex> stack;
 
	public TopologicalOrdering(){
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(Vertex v){
    	v.setVisited(true);
    	
    	for(Vertex x : v.getAdjacenciesList()){
    		if(!x.isVisited()){
    			dfs(x);
    		}
    		
    	}
    	this.stack.push(v);
    }
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}
}
 