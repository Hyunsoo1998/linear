package queue.array;

public class ArrayQueue {
private Object[] arr;
private int MAX_QUEUE_SIZE;
private int front;
private int rear;
private int peek;

ArrayQueue(int size) {
	this.arr = new Object[size];
	this.MAX_QUEUE_SIZE = size;
	this.front= 0;
	this.rear= -1;
	this.peek = this.front;
	
}
public void enqueue(Object value ) {
	if(MAX_QUEUE_SIZE -1 == rear) {
		throw new StackOverflowError();
	}
	arr[++rear] = value;
}
	public Object dequeue() {
		if(front>= MAX_QUEUE_SIZE) {
			throw new ArrayIndexOutOfBoundsException();
		
		}
		Object value = arr[peek];
		arr[peek] = null;
		peek = ++front ;
		return value;
	}
	public Object peek() {
		return arr[peek];
	}
	public boolean isFull() {
		return MAX_QUEUE_SIZE -1 == rear;
	}
}

/*	구현된 ArrayQueue클래스의 멤버 변수와 메서드를 살펴보자
 *  arr
 * Object 타입의 데이터를 임시로 담을 배열을 선언한다.
 * 
 * front
 * 큐의 첫 번째 위치를 가리키는 변수이다.
 * 
 * rear
 * 큐에서 삽입될 데이터의 위치를 가리키는 변수이다. 빈 큐를 나타내기 위해 -1로 초기화를 했다.
 * 
 * enqueue
 * if(MAX_QUEUE_SIZE -1 == rear) {
 * throw new StackOverflowError();
 * 큐의 크기를 가지고 있는 MAX_QUEUE_SIZE와 큐에서 삽입될 데이터의 위치를 가리키는 rear 변수를 서로 비교하여
 * 같으면 큐가 가득 찬 상태이므로 StackOverflowError를 발생시킨다.
 * 
 * arr[++rear] = value;
 * Object 타입을 인자 (v)로 받아서 배열에 값을 삽입하기 전에 마지막 위치를 +1만큼 증가시킨 다음 데이터를 삽입한다.
 * 
 * dequeue() if(front == MAX_QUEUE_SIZE) {
 * throw new ArrayIndexOutOfBoundsException(); }
 * 가용 용량을 모두 사용한 큐에서 데이터를 꺼내려 할 때, ArrayIndexOutOfBoundsException을 발생시킨다.
 * 큐의 첫 번째 위치를 가리키고 있는 front는 데이터가 제거 되면 +1씩 증가되어 큐의 가용 크기를 사용할 수 없어서 결국 MAX_QUEUE_SIZE만큼
 * 같아진다.
 * 
 * Object value = arr[peek];
 * arr[peek] = null;
 * peek = ++front;
 * return value;
 * 다음 데이터를 가리키기 위해 front 를 +1만큼 증가시키고 peek를 front값과 동일하게 해준다.
 * 
 * peek () 
 * front가 바라보는 데이터를 가져올 수 있다.
 * 
 * isFull()
 * return MAX_QUEUE_SIZE-1 == rear;
 * 큐의 최대 크기와 삽입될 데이터의 위치 값을 서로 비교하여 큐가 가득 차 있는지 확인한다.
 * 
 * 
 * 
 * */



