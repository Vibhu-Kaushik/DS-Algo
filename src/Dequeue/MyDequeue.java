package Dequeue;

public class MyDequeue<E> {

	
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev= head;
		head = toAdd;
		
	}
	public E removeLast() {
		
		if (head == null) {
			System.out.println("Empty queue");
		}
		Node<E> toRemove = tail;
		tail = tail.next;
		if(tail == null) {
			head = null;
		}
		tail.prev= null;
		toRemove.next = null;
		return toRemove.data;
		
	}
	
	public static class Node<E> {
		E data;
		Node<E> prev, next;
		
		public Node(E data) {
			this.data = data;
			this.prev = this.next = null;
		}
	}
}
