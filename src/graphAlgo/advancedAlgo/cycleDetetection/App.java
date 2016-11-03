package graphAlgo.advancedAlgo.cycleDetetection;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args){
	   Vertex vertex1 = new Vertex("1");
	   Vertex vertex2 = new Vertex("2");
	   Vertex vertex3 = new Vertex("3");
	   Vertex vertex4 = new Vertex("4");
	   Vertex vertex5 = new Vertex("5");
	   Vertex vertex6 = new Vertex("6");
	   
	   vertex1.addVertex(vertex2);
	   vertex1.addVertex(vertex3);
	   vertex2.addVertex(vertex3);
	   vertex4.addVertex(vertex1);
	   vertex4.addVertex(vertex5);
	   vertex5.addVertex(vertex6);
	   vertex6.addVertex(vertex4);
	   
	   List<Vertex> vertexList = new ArrayList<Vertex>();
	   vertexList.add(vertex1);
	   vertexList.add(vertex2);
	   vertexList.add(vertex3);
	   vertexList.add(vertex4);
	   vertexList.add(vertex5);
	   vertexList.add(vertex6);
      
       CycleDetection obj = new CycleDetection();
       obj.detectCycle(vertexList);
  }
}
