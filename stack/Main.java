package stack;
/*5. 선형구조
 * 스택(stack)
 * 스택이란? 데이터를 임시저장 하기위한 자료구조로 먼저 삽입한 데이터가 나중에 꺼내지는 특징이 있다.
 * 스택의 삽입은 push 스택에서 데이터를 꺼내는것을 pop이라 한다.
 * 꺼낸 데이터는 스택에서 제거된다.
 *  
 *  스택의 특징
 *  1.스택의 마지막 위치에 데이터를 삽입할수있다.
 *  2.스택의 마지막 위치에서 데이터를 꺼낼수있다.
 *  3.스택의 마지막 데이터를 알 수 있다.
 *  */

//배열로 만들기.

public class Main {
public static void main(String[]args) {
	ArrayStack arrayStack = new ArrayStack(3);
	arrayStack.push("1");
	arrayStack.push("2");
	arrayStack.push("3");
	
	System.out.println(arrayStack.pop());
	System.out.println(arrayStack.pop());
	System.out.println(arrayStack.pop());
	System.out.println(arrayStack.empty());
	
}
}
