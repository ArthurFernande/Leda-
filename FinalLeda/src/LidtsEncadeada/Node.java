package LidtsEncadeada;

public class Node {
	protected Integer  data;
	protected Node next;
	protected Node previous;
	
	public Node() {
		
	}
	public Node(Integer data,Node next,Node previous) {
		this.data=data;
		this.next=next;
		this.previous =previous;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public boolean isNILL() {
		return this.data==null;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
