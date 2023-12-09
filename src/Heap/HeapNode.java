package Heap;

public class HeapNode {
	int data;
	HeapNode left;
	HeapNode right;
	
	public HeapNode(int data) {
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public HeapNode getLeft() {
		return left;
	}
	public HeapNode getRight() {
		return right;
	}
	public void setData() {
		this.data=data;
	}
	public void setLeft() {
		this.left=left;
	}
	public void setRight() {
		this.right=right;
	}
	

}
