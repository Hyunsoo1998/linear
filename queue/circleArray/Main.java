package queue.circleArray;

public class Main {
public static void main(String[]args) {
	CircleArrayQueue queue  = new CircleArrayQueue(5);
	queue.enqueue("사과");
	queue.enqueue("바나나");
	queue.enqueue("딸기");
	queue.enqueue("귤");
	queue.enqueue("배");

	System.out.println(String.format("첫 번째 값을 가져옵니다=> %s", queue.dequeue()));
	System.out.println(String.format("두 번째 값을 가져옵니다=> %s", queue.dequeue()));
	System.out.println(String.format("세 번째 값을 가져옵니다=> %s", queue.dequeue()));
	System.out.println(String.format("네 번째 값을 가져옵니다=> %s", queue.dequeue()));
	System.out.println(String.format("다섯 번째 값을 가져옵니다=> %s", queue.dequeue()));

	System.out.println("");
	System.out.println("---원형 큐이므로 가용 공간을 재 사용할 수 있다.");
	queue.enqueue("체리");
	System.out.println(String.format("여섯 번째 값을 가져옵니다=> %s",queue.dequeue()));
	if(queue.empty()) {
		System.out.println("---");
		System.out.println("큐가 비어있습니다.");
	}
}
}
