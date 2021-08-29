package bridgelab;

public class Queue {
	static final int MAX = 3;
	int start;
	int a[] = new int[MAX];

	boolean isEmpty() {
		return (start < 0);
	}

	Queue() {
		start = -1;
	}

	boolean enqueue(int x) {
		if (start >= (MAX - 1)) {
			System.out.println("exceeds limit");
			return false;
		} else {
			a[++start] = x;
			System.out.println(x + " ENQUEUED into QUEUE");
			return true;
		}
	}

	int dequeue() {
		if (start < 0) {
			System.out.println("Limit undefined");
			return 0;
		} else {
			int x = a[start--];
			return x;
		}
	}

	public void displayElements() {
		if (isEmpty())
			System.out.println("queue is empty");
		else {
			System.out.println("------------------------------------");
			for (int i = 0; i < MAX; i++) {
				System.out.println(a[i]);
			}
			System.out.println("------------------------------------");
		}
	}

}
