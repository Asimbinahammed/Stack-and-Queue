package bridgelab;

public class QueueMain {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.displayElements();
		
		//uc2
		queue.dequeue();
		queue.displayElements();

		queue.dequeue();
		queue.displayElements();
		
		queue.dequeue();
		queue.displayElements();
		

	}

}
