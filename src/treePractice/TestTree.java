package treePractice;

public class TestTree {

	public static void main(String[] args) {
		int data[] = {5,3,2,8,7,6,2,1,4,9,0};
		
		Tree newTree = new Tree();
		
		for(int x : data){
			newTree.insertNode(x);
		}
		
		TreeNode node = newTree.getRoot();
		
		System.out.print("Inorder Traversal :");
		newTree.inorderTraversal(node);
	    System.out.println();
		
		System.out.print("PostOrder Traversal :");
		newTree.postOrderTraversal(node);
		System.out.println();
		
		System.out.print("PreOrder Traversal :");
		newTree.preOrderTraversal(node);
		System.out.println();
		
		System.out.print("LevelOrder Traversal :");
		newTree.levelOrderTraversal(node);
		System.out.println();
	}

}
