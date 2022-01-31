package queue.array;

public class LinkedListQueue {
	//front: 큐의 첫번째 위치를 가리키는 변수이다.
private Node front = null;
//rear: 큐에 삽입될 데이터의 위치를 가리키는 변수이다. 빈 큐를 나타내기 위해 -1로 초기화했다.
private Node rear = null;
//peak: 큐의 현재 값을 알기 위한 변수이다. front와 대응 된다.
private Node peek = null;

//내부 클래스 Node: 큐에서 사용할 노드의 구현체이다. 데이터를 담을 Object타입의 value변수와 노드끼리 연결할 next 노드를 선언한다.
private class Node{ 
	private Object value;
	private Node next;
	
	Node(Object value) {
		this.value = value;
	}
	private Object getValue() {//데이터를 가져오기 위한 메서드.
		return this.value;
	}
}
/*enqueue(Object value):데이터를 삽입할 때, front가 null인 경우는 초기 큐를 생성할 때 이다.
 *  삽입할 데이터를 가진 노드를 생성한 후 front와 peek,rear를 각각 할당해 준다.
 * 큐가 쌓여 있는 경우에는 마찬가지로 삽입할 데이터를 가진 노드를 생성한 후 큐의 꼬리 부분에 해당하는 rear의 next에 할당하여 rear가
 * 다시 rear.next를 바라보도록 한다.
 * 
 * */
public void enqueue(Object value) {
	if(front == null) {
		front = new Node(value);
		peek = front;
		rear = front;
	}
	else { 
		rear.next = new Node(value);
		rear = rear.next;
		
		
	}
}
/*dequeue(): 큐의 첫 번째 노드를 가리키고 있는 peek를 이용하여 데이터를 value 변수에 할당해 준다.
 * 사용한 노드를 제거하기 위해 임시 노드를 생성하여 front와 같은 노드를 바라보도록 한다.
 * 다음 노드를 사용하기 위해 front가 front.next를 바라보도록 하고 peek도 front와 동일하게 수정해 준다.
 * temp = null을 통해 사용한 노드를 제거해 주고 value를 반환한다.
 * */
public Object dequeue() {
	Object value = peek.getValue();
	Node temp = front;
	
	front = front.next;
	peek = front;
	temp = null;
	return value;
}
//peek(): front가 바라보는 데이터를 가져올 수 있다.
public Object peek () {
	return peek.getValue();
}//empty(): 큐가 비어있는 상태에는 peek가 null이 되므로 dequeue()메서드를 통해 큐가 비어있는지 확인이 가능하다.
public boolean empty() {
	return peek == null;
}


}
