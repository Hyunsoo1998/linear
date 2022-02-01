package deque;

public class LinkedListDeque {
	private class Node {
		Object data= null;
		Node next = null;
		
		Node(Object data) {
			this.data= data;
		}
		private Object getValue() {
			return data;
		}		
	}
	private Node front = null;
	private Node rear = null;
	 
	public void addFirst(Object data) {
		Node node = new Node(data);
		if(front == null) {
			front = node;
			rear = front;
			return;
		}
		Node temp = front ;
		front = node;
		front.next = temp;		
	}
	public void addLast(Object data) {
		Node node = new Node (data);
	
		if(front == null) {
			front = node;
			rear= front;
			return;
		}
		rear.next = node;
		rear = rear.next;
	}
	public Object removeFirst() {
		Object value = front.getValue();
		front = front.next;	
		return value;
	}
	public Object removeLast() {
		Object value = rear.getValue();
		
		Node temp = front;
		while(temp != null) {
			if(temp.next!=rear) {
				temp = temp.next;
				continue;
			}
			rear= temp;
			rear.next = null;
		}
		return value;
	}
	public String print() {
		String datas = "";
		Node temp = front;
		while(temp != null) {
			Object value = temp.getValue();
			temp= temp.next;
			if(temp == null) {
				datas += value;
				
			} else {
				datas += String.format("%s>=", value);
			}
		}
		return datas;
	}
	
	
}
