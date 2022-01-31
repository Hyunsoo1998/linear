package queue.array;

public class Main2 {
public static void main(String[]args) {
	LinkedListQueue queue = new LinkedListQueue();
	
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	queue.enqueue(4);
	queue.enqueue(5);
	
	System.out.println(String.format("첫번째 값을 가져옵니다.=>%s", queue.dequeue()));
	System.out.println(String.format("두번째 값을 가져옵니다.=>%s", queue.dequeue()));
	System.out.println(String.format("세번째 값을 가져옵니다.=>%s", queue.dequeue()));
	System.out.println(String.format("네번째 값을 가져옵니다.=>%s", queue.dequeue()));
	System.out.println(String.format("다섯번째 값을 가져옵니다.=>%s", queue.dequeue()));

	if(queue.empty()) {
		System.out.println("---");
		System.out.println("큐가 비어있습니다.");
	}
}
}
