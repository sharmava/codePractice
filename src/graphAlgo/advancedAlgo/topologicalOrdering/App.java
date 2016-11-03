package graphAlgo.advancedAlgo.topologicalOrdering;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
   public static void main(String[] args){
	   TopologicalOrdering   t  =  new TopologicalOrdering();
	   
	   List<Vertex> graph = new ArrayList<Vertex>();
	   graph.add(new Vertex("0"));
	   graph.add(new Vertex("1"));
	   graph.add(new Vertex("2"));
	   graph.add(new Vertex("3"));
	   graph.add(new Vertex("4"));
	   graph.add(new Vertex("5"));
	   
	   graph.get(2).addVertex(graph.get(3));
	   graph.get(3).addVertex(graph.get(1));
	   graph.get(4).addVertex(graph.get(0));
	   graph.get(4).addVertex(graph.get(1));
	   graph.get(5).addVertex(graph.get(0));
	   graph.get(5).addVertex(graph.get(2));
	   
	   for(int i=0; i<graph.size();i++){
		   if(!graph.get(i).isVisited()){
			   t.dfs(graph.get(i));
		   }
	   }
	   
	   Stack<Vertex> s = t.getStack();
	   for(int i=0;i<graph.size();i++){
		   Vertex vertex  = s.pop();
		   System.out.println(vertex.getData());
	   }
   }
}
