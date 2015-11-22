package treePractice;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	private TreeNode root;
	
	public Tree(){
		this.setRoot(null);
	}
	
	public void insertNode(int newData){
		if(root == null){
			root = new TreeNode(newData);
		}else if(newData > root.getData()){
			 if(root.getRightChild() == null){
				 root.setRightChild(new TreeNode(newData));
			 }else{
				 root.getRightChild().insert(newData);
			 }
		}else if(newData < root.getData()){
			if(root.getLeftChild() == null){
				root.setLeftChild(new TreeNode(newData));
			}else{
				root.getLeftChild().insert(newData);
			}
		}
	}
    
	public void levelOrderTraversal(TreeNode node){
		Queue<TreeNode>q = new LinkedList<TreeNode>();
		q.offer(node);
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			System.out.print(temp.getData()+" ");
			if(temp.getLeftChild()!=null){
				q.offer(temp.getLeftChild());
			}
			if(temp.getRightChild()!=null){
				q.offer(temp.getRightChild());
			}
		}
	}
	
	public void preOrderTraversal(TreeNode node){
		if(node!=null){
			System.out.print(node.getData()+" ");
			preOrderTraversal(node.getLeftChild());
			preOrderTraversal(node.getRightChild());
		}
	}
	
	public void postOrderTraversal(TreeNode node){
		if(node!=null){
			postOrderTraversal(node.getLeftChild());
			postOrderTraversal(node.getRightChild());
			System.out.print(node.getData()+" ");
		}
	}
	
	public void inorderTraversal(TreeNode node){
		if(node!=null){
			inorderTraversal(node.getLeftChild());
			System.out.print(node.getData()+" ");
			inorderTraversal(node.getRightChild());
		}
	}
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
}
