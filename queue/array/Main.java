package queue.array;

//자바 배열의 특징ㅇ로 고정된 크기 값을 가진 큐를 만들 수 있다. 아래는 배열로 구현된 코드이다.


public class Main {
	public static void main(String[]args) {
		ArrayQueue arrayQueue = new ArrayQueue(5);
		arrayQueue.enqueue(1000);
		arrayQueue.enqueue(2000);
		arrayQueue.enqueue(3000);
		arrayQueue.enqueue(4000);
		arrayQueue.enqueue(5000);
		
		System.out.println(arrayQueue.dequeue());
		System.out.println(arrayQueue.dequeue());
		System.out.println(arrayQueue.dequeue());
		System.out.println(arrayQueue.dequeue());
		System.out.println(arrayQueue.dequeue());
		
	}
}
