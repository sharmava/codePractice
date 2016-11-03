package graphAlgo.advancedAlgo.cycleDetetection;

import java.util.List;

public class CycleDetection {
    public void detectCycle(List<Vertex> list){
    	for(Vertex v : list){
    		if(! v.isVisited()){
    			System.out.println("Visit vertex - "+v.getName());
    			dfs(v);
    		}
    	}
    }

	private void dfs(Vertex vertex) {
		
		System.out.println("Visiting dfs for vertex - "+vertex.getName());
		vertex.setBeingVisited(true);
		System.out.println("Exploring adjacencies list of vertex - "+vertex.getName());
		for(Vertex v : vertex.getAdjacenciesList() ){
			if(v.isBeingVisited()){
				System.out.println("Cycle exist for vertex - "+v.getName());
				return;
			}
			if(!v.isVisited()){
				System.out.println("Visit vertex - "+v.getName());
				v.setVisited(true);
				dfs(v);
			}
		}
		
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
	}
}
