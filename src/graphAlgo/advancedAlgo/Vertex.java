package graphAlgo.advancedAlgo;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean visited;
    private List<Vertex> adjList;
    
    public Vertex(int data){
    	this.data = data;
        this.setAdjList(new ArrayList<Vertex>());   
    }
    
    public void addVertex(Vertex v){
    	this.getAdjList().add(v);
    }
    
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<Vertex> getAdjList() {
		return adjList;
	}
	public void setAdjList(List<Vertex> adjList) {
		this.adjList = adjList;
	}
}
