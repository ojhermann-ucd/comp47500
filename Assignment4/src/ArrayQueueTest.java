
public class ArrayQueueTest {

	public static void dequeueTest(ArrayQueue<Object> myQueue) {
		try {
			myQueue.dequeue();
			System.out.println("Action: dequeue()");
			System.out.println(myQueue.toString());
		} catch (EmptyQueueException e) {
			System.out.println("Action: dequeue()");
			System.out.println(e.getMessage() + "\n");
		}
	}

	public static void enqueueTest(ArrayQueue<Object> myQueue, Object o) {
		try {
			myQueue.enqueue(o);
			System.out.println("Action: enqueue()");
			System.out.println(myQueue.toString());
		} catch (FullQueueException e) {
			System.out.println("Action: enqueue()");
			System.out.println(e.getMessage() + "\n");
		}
	}

	public static void main(String[] args) {

		ArrayQueue<Object> myQueue = new ArrayQueue(5);
		System.out.println("Action: new ArrayQueue");
		System.out.println(myQueue.toString());

		dequeueTest(myQueue);
		
		enqueueTest(myQueue, 'a');
		enqueueTest(myQueue, 'b');
		enqueueTest(myQueue, 'c');
		enqueueTest(myQueue, 'd');

		dequeueTest(myQueue);
		enqueueTest(myQueue, 'd');
		enqueueTest(myQueue, 'e');
		dequeueTest(myQueue);

	}

}
