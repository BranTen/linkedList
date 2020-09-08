package linkedlist;

public class LinkedList {
	
	Node first;
	Node last;
	int size;
	int data;
	public LinkedList(){
		
	}
	public boolean isEmpty(){
		return (first== null);
	}
	public void addToStart(int data){
		Node n = new Node(data, null);
		size++;
		if(isEmpty()){
			first = n;
			last = first;
		}else{
			n.setNext(first);
			first = n;
		}
	}
	public void addToEnd(int data){
		Node n = new Node(data, null);
		size++;
		if(!isEmpty()){
			last.setNext(n);
			last = n;
		}else{
			first = n;
			last = first;
		}
	}
	
	
}
public class Node{
	int data;
	Node next;
	public Node(){
		data = null;
		next = null;
	}
	public Node(int i, Node n){
	data = i;
	next = n;
	}
	public void setNext(Node n){
		next=n;
	}
	public Node getNext(){
		return next;
	}
}