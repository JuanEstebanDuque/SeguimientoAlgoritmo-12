package model;

public class Node {
	//Attributes
	private int value;
	private int count;
	
	//Link
	private Node prev;
	private Node next;
	
	//Methods
	public Node(int value) {
		this.value = value;
		this.count = 0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
