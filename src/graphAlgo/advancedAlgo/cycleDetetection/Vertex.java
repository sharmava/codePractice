package graphAlgo.advancedAlgo.cycleDetetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjacenciesList;

	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<Vertex>();
	}
	
	public void addVertex(Vertex v){
		this.adjacenciesList.add(v);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Vertex> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}

}
