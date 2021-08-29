package bridgelabz;


public class StackMain {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.displayStackElements();
		
		//uc2
		stack.peek();
		stack.pop();
		stack.displayStackElements();

		stack.peek();
		stack.pop();
		stack.displayStackElements();
		
		stack.peek();
		stack.pop();
		stack.displayStackElements();

	}
}
