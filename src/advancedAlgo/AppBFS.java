package advancedAlgo;

public class AppBFS {
   public static void main(String[] args){
	   Vertex  root = new Vertex(0);
	   Vertex a = new Vertex(1);
	   Vertex b = new Vertex(2);
	   Vertex c = new Vertex(3);
	   Vertex d = new Vertex(4);
	   Vertex e = new Vertex(5);
	   Vertex f = new Vertex(6);
	   
	   root.addVertex(a);
	   a.addVertex(b);
	   a.addVertex(c);
	   b.addVertex(d);
	   b.addVertex(e);
	   c.addVertex(f);
	   
	   new BFS().bfs(root);
	   
   }
}
