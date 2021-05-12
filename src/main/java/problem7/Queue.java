package problem7;

public interface Queue {
	void enqueue(Object elem);
	Object dequeue();
	boolean empty();
}