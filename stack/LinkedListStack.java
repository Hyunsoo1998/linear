package stack;

public class LinkedListStack {
	private Node head;
	private Node top;
	
	
	private class Node { 
		private Object data;
		private Node next;
		
		Node(Object data) {
			this.data = data;
		}
	}
	public void push(Object data) {
		if(head == null) {
			head = new Node(data);
			top = head;
			return;
		}
		Node node = new Node(data);
		top.next = node;
		top = node;
	}
	public Object pop () {
		if(top == null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node temp = head;
		Object data = this.peek();
		if(temp.next == null) {
			head = null;
			top = null;
			return data;
		}
		while(temp.next != null) {
			top = temp;
			temp = temp.next;
		}
		top.next = null;
		return data;
	}
	public Object peek() {
		return top.data;
	}
	public boolean empty () {
		return top == null;
	}	
}
/*구현된 LinkedList 클래스의 멤버변수와 메서드를 살펴보자
 * head
 * 스택의 첫 부분을 담당한다. head의 위치는 변경되지 않는다.
 * 
 * top 
 * 스택의 마지막 위치를 담당한다. head와는 다르게 데이터가 삽입 될 때마다 위치가 변한다.
 * 
 * push
 * if(head == null ) {
 * head = new Node(data);
 * top = head;
 * return; }
 * top이 null인 경우는 빈 스택을 의미하므로 새로 생성한 노드(head)를 top이 가리키게 된다.
 * 
 * 1개 이상의 데이터가 존재하는 연결리스트의 스택에 데이터를 삽입할 때 새 노드를 연결하기 위해
 * top.next를 통해 인저 노드를 연결하면 top은 새 노드를 가리키게 된다.
 * 
 * Node node = new Node(data);
 * top.next = node;
 * top = node;
 * 
 * 
 * top이 null인 경우는 빈 스택을 의미한다. 빈 스택에 데이터를 꺼내오는 과정이므로
 * ArrayIndexOutOfBoundsException을 발생시킨다.
 * 
 * pop()
 * if(top == null ) {
 * throw new ArrayOutOfBoundsException(); }
 * 
 * if(temp.next == null) {
 * head = null;
 * top = null;
 * return data;
 * }
 * 
 * this.peek()를 통해 값을 가져오며 temp.next가 null인 경우는 스택의 노드 개수가 1개이므로 head와 top을 null로 세팅하고 데이터를 반환한다.*/
 
 
 // 스택의 노드 개수가 2개 이상일 경우 top이 가리키고 있는 노드를 변경하기 위해 head 부터 순회하여
 // 현재 top이 가리키고 있는 노드의 앞 노드를 구한다. 그리고 top 을 이전 노드로 가리키도록 수정하고
 // top.next를 통해 데이터를 꺼낸 노드를 제거한다.
 
