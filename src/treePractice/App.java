package treePractice;

public class App {
  public static void main(String[] args) {
	Tree<String> bst = new BinarySearchTree<String>();
	bst.insert("Kevin");
	bst.insert("Varun");
	bst.insert("Ankita");
	bst.insert("Alpha");
	bst.insert("Dan");
	bst.insert("Jobs");
	
	System.out.println(bst.getMaxNodeValue());
	
	System.out.println(bst.getMinNodeValue());
	
	bst.traversal();
	
	System.out.println("");
	bst.delete("Kevin");
	
	bst.traversal();
}
}
