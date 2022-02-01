package queue.circleArray;

/*front:데이터 삽입에 대한 위치 값이다.
 * rear:데이터 삭제에 대한 위치 값이다.
 * CircleArrayQueue(int size):
 * this.MAX_QUEUE_SIZE = size+1;;원형 큐는 데이터의 순환을 위해 항상 하나의 배열공간을 비워주게된다.
 * 그래서 원형 큐의 크기를 세팅할 때는 빈 공간을 고려하여 +1만큼 크기를 더해준다.
 * 
 * enqueue(Object value):
 * if((rear+1) % MAX_QUEUE_SIZE == front) { 
 * throw new ArrayIndexOutOfBoundsException();}
 * 데이터 삽입의 위치 값이 front 값과 같으면 가득 찬 상태이므로 ArrayIndexOutOfBoundsException
 * 을 발생시킨다.
 * 
 * rear = (rear+1) % MAX_QUEUE_SIZE;
 * arr[rear] = v;
 * 데이터를 삽입할 위치 값을 구한 뒤 해당 인덱스에 값을 넣어준다.
 * 
 * dequeue()
 * if(empty()) { throw new ArrayIndexOutOfBoundsException(); }
 * 큐가 비어있을 경우에는 ArrayIndexOutOfBoundsException을 발생시킨다.
 * 
 * front = (front+1) % MAX_QUEUE_SIZE;
 * Object value = arr[front];
 * arr[front] = null;
 * return value;
 * 데이터 삭제의 위치 값을 구한 뒤 해당 인덱스를 Object 타입의 변수에 저장하고 사용한 공간을 null로 초기화해준다.
 * 다음 데이터가 저장된 변수를 반환한다.
 * 
 * empty()
 * return front == rear;
 * 삽입과 삭제에 대한 위치 값들이 서로 같은 인덱스를 바라보고 있으면 큐가 가득 찬 상태 이다.
 * 
 * */


public class CircleArrayQueue {
private Object arr[];
private int MAX_QUEUE_SIZE;
private int front = 0 ;
private int rear = 0;

CircleArrayQueue(int size) {
	this.MAX_QUEUE_SIZE = size +1;
	this.arr = new Object[this.MAX_QUEUE_SIZE];
}
public void enqueue(Object v) {
	if((rear+1)%MAX_QUEUE_SIZE == front) {
		throw new ArrayIndexOutOfBoundsException();
	}
	rear = (rear+1) % MAX_QUEUE_SIZE;
	arr[rear] = v;
}
public Object dequeue() {
	if(empty()) {
		throw new ArrayIndexOutOfBoundsException();
	}
	front = (front+1) %MAX_QUEUE_SIZE;
	Object value  = arr[front];
	arr[front] = null;
	return value;
}
public boolean empty() {
	return front == rear;
}
}
