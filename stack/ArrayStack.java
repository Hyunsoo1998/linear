package stack;

public class ArrayStack {
private Object[] stack;
private int top;

ArrayStack(int length) {
	//빈 스택은 top = -1로 표현
	this.top = -1;
	this.stack = new Object[length];
}
/*
 * 데이터 삽입
 * @param data
 */
public void push(Object data) {
	if(top == stack.length -1) {
		throw new StackOverflowError();
	}
	stack[++top] = data;
}
/*데이터 가져오기
 * @return Object
 */
public Object pop() {
	if(top == -1) {
		throw new ArrayIndexOutOfBoundsException();
	}
	Object temp = stack[top];
	stack[top--] = null;
	return temp;
}
/*현재 스택의 마지막 데이터를 가져온다.
 * @return Object
 */
public Object peek() {
	return stack[top];
}
/*스택이 비었는지 확인
	return boolean
*/
public boolean empty() {
	return top == -1;
}
}
/* Object 타입의 데이터를 임시로 담을 배열을 선언한다.

top: 스택의 마지막 위치를 가리키기 위한 변수이며 초기 빈 스택을 구분짓기 위해 -1을 세팅해 준다.*/

/*
 * push(Object data)
 *  if(top == stack.length-1){
 *  throw new StackOverflowError();}  
 *만약 데이터가 가득 찬 상태에서 삽입을 시도하면 StackOverflowError를 발생시킨다.
 if (top == -1) {
 	stack[++top] = data;
 	return;}
 	stack[++top] = data;
 	스택의 푸시는 마지막 위치에 값을 넣는 것이므로, 위치 값인 top 을 이용하여 삽입한다.
 	증감 연산자를 이용하여 top을 하나 증가시키고 해당 위치에 데이터를 삽입한다.
 *
 *pop()
 *if (top ==-1) {
 *	throw new ArrayIndexOutOfBoundsException(); }
 
 *데이터가 존재하지 않을때는 ArrayIndexOutOfBoundsException을 발생시킨다.
 *Object temp = stack [top];
 *stack[top--] =null;
 *return temp;
 *
 *마지막 위치 (top)에서 데이터를 꺼내오고 꺼내온 데이터는 null로 초기화하여 데이터를 제거해준다.
 *꺼낸 후에 top--를 통해 마지막 위치를 변경해준다.
 *
 *peek()
 *Pop()메서드와는 다르게 마지막 데이터의 값을 가져오며 스택에서는 제거되지 않는다.
 *
 *empty()
 *jdk에서 제공하는 ArrayStack 클래스의 생성자에서 초기 빈 스택을 생성할 때 top = -1로 세팅하고
 *있으므로 예제에서도 top이 -1일 경우는 빈 스택으로 간주한다.
 */

