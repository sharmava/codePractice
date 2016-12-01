package treePractice;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	private Node<T> root;

	@Override
	public void insert(T newData) {
		if (root == null) {
			root = new Node(newData);
		} else {
			insertNode(newData, root);
		}
	}

	@Override
	public T getMaxNodeValue() {
		if (root == null) {
			return null;
		} else {
			return getMax(root);
		}
	}

	@Override
	public T getMinNodeValue() {
		if (root == null) {
			return null;
		} else {
			return getMin(root);
		}
	}

	private void insertNode(T newData, Node<T> node) {
		if (newData.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() != null) {
				insertNode(newData, node.getLeftChild());
			} else {
				node.setLeftChild(new Node(newData));
			}
		} else {
			if (node.getRightChild() != null) {
				insertNode(newData, node.getRightChild());
			} else {
				node.setRightChild(new Node(newData));
			}
		}
	}

	@Override
	public void delete(T data) {
	    if(root != null){
	    	root = deleteNode(root, data);
	    }

	}
	
	private Node<T> deleteNode(Node<T>node, T data){

		if(node.getLeftChild()!= null && data.compareTo(node.getData()) < 0){
			node.setLeftChild(deleteNode(node.getLeftChild(),data));
		}else if(node.getRightChild()!=null && data.compareTo(node.getData()) > 0){
			node.setRightChild(deleteNode(node.getRightChild(),data));
		}else{
			if(node.getLeftChild() == null && node.getRightChild() == null){
				System.out.println("Removing the leaf node");
				return null;
			}else if(node.getLeftChild() != null && node.getRightChild() != null){
				//TODO: node with 2 children
				 System.out.println("Removing the node with 2 children");
				Node<T> maxNode =getMaxInLeftTree(node.getLeftChild());
				node.setData(maxNode.getData());
				node.setLeftChild(deleteNode(node.getLeftChild(), node.getData()));
				
			}else if(node.getLeftChild() == null){
				//TODO: node has right child
			    System.out.println("Removing the node with 1 immediate child");
				Node<T> tempNode = node.getRightChild();
			      node = null;
			      return tempNode;
			}else if(node.getLeftChild() == null){
				//TODO: node has a left child
				System.out.println("Removing the node with 1 immediate child");
				Node<T> tempNode = node.getLeftChild();
			      node = null;
			      return tempNode;
			}
		}
		
		return node;
	}

	@Override
	public void traversal() {
		if(root != null){
			inorderTraversal(root);
		}
	}

	private void inorderTraversal(Node<T> node) {
		if(node.getLeftChild() != null){
			inorderTraversal(node.getLeftChild());
		}
		System.out.print(node.getData()+" -->");
		if(node.getRightChild() != null){
			inorderTraversal(node.getRightChild());
		}
	}

	private T getMax(Node<T> node) {
		T result = node.getData();
		if (node.getRightChild() != null) {
			return getMax(node.getRightChild());
		}
		return result;
	}

	private T getMin(Node<T> node) {
		T result = node.getData();
		if (node.getLeftChild() != null) {
			return getMin(node.getLeftChild());
		}
		return result;
	}

	private Node<T> getMaxInLeftTree(Node<T> node){
		if(node != null){
			Node<T> max = node;
			while(max.getRightChild() != null){
				max = max.getRightChild();
			}
			return max;
		}
		return node;
	}
	
}
