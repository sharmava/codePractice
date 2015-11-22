package treePractice;

public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int nodeData) {
		data = nodeData;
		leftChild = null;
		rightChild = null;
	}

	public void insert(int newData) {
		if (newData > this.data) {
			if (rightChild == null) {
				rightChild = new TreeNode(newData);
			} else {
				rightChild.insert(newData);
			}
		} else {
			if (leftChild == null) {
				leftChild = new TreeNode(newData);
			} else {
				leftChild.insert(newData);
			}
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
}
