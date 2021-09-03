package com.bridgelabz;

import static java.lang.System.exit;

class StackUsingLinkedlist {
	private class Node {

		int data;
		Node link;
	}

	Node top;

	StackUsingLinkedlist() {
		this.top = null;
	}

	@SuppressWarnings("unused")
	public void push(int x) {
		Node temp = new Node();

		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}
		temp.data = x;
		temp.link = top;
		top = temp;
	}

	// check empty function
	public boolean isEmpty() {
		return top == null;
	}

	// return top element in a stack
	public void peek() {
		if (!isEmpty()) {
			System.out.println("top element in stack is "+top.data);
		} else {
			System.out.println("Stack is empty");
		}
	}

	// pop top element from the stack
	public void pop() {
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}
		System.out.println("poped element is" + top.data);
		top = (top).link;
	}

	public void display() {
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.println( temp.data);
				temp = temp.link;
			}
		}
	}
}
