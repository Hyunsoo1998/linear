package stack;

//연결 리스트로 만들기
/* 배열과는 다르게 고정된 크기 값이 아니므로 유동적으로 크기 값을 가지는 스택을 생성할 수 있다. 고정된 크기를 가지지 않아
 * 배열보다 장점이 많지만 배열처럼 인덱스를 사용하지 못해서 데이터를 꺼내오고 삭제할 때는 처음부터 마지막 노드까지 순회해야 하는 단점이있다.
 * 그로 인해 배열로 만들어진  스택보다 pop()비용이 더 소모된다. 프로그램 상황에 따라서 배열과 연결리스트를 선택하여 스택을 선택해야한다.
 * 아래는 연결리스트로 구현된 코드이다.
 */


public class Main2 {
public static void main(String[]args) {
	LinkedListStack stack = new LinkedListStack();
	stack.push("1");
	stack.push("2");
	stack.push("3");

	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
}
}
