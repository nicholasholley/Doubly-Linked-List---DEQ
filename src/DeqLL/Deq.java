package DeqLL;

public class Deq {

	private Node frontOfQueue, backOfQueue;// Points to the top of the stack
	int llSize = 0;// keep track of the link list size
	int MAX_SIZE = 5000;// Maximum size for the link list

	public Deq() {
		frontOfQueue = null;// pointers for the back and front of queue are null
							// when empty
		backOfQueue = null;
	} // Constructor of Queue

	public void addToFront(int x) {
		// PRECONDITION: the LL is not full
		if (!isFull()) {
			Node aNode = new Node(x, frontOfQueue, null);// Make a temporary new
															// node
			if (isEmpty()) {// have the first node be seen by the back pointer
							// if empty queue
				backOfQueue = aNode;
			} else {// have the node before the front be set to the temporary
					// node
				frontOfQueue.previous = aNode;
			}
			aNode.next = frontOfQueue;// set the front as the new aNode
			frontOfQueue = aNode;
			llSize++;// update link list size
		}
	}

	public void addToBack(int x) {
		// PRECONDITION: the LL is not full
		if (!isFull()) {
			Node aNode = new Node(x, null, backOfQueue);// Make a temporary new
														// node
			if (isEmpty()) {// have the first node be seen by the front pointer
							// if empty queue
				frontOfQueue = aNode;
			} else {// have the node before the back be set to the temporary
					// node
				backOfQueue.next = aNode;
				aNode.previous = backOfQueue;
			}
			backOfQueue = aNode;// set the back as the new aNode
			llSize++;// update link list size
		}
	}

	private int front() {// get the int at the front
		return frontOfQueue.d;
	}

	private int back() {// get the int at the back
		return backOfQueue.d;
	}

	public int removeFromFront() {
		// PRECONDIITON: The LL is not empty
		int n = front();// get the return for the program
		if (!isEmpty()) {
			frontOfQueue = frontOfQueue.next;// have the front point to the next
												// node
			llSize--;// update link list size
			if (isEmpty()) {
				backOfQueue = null;// make sure back is null if ll is empty
			}
		}
		return n;

	}

	public int removeFromBack() {
		// PRECONDIITON: The LL is not empty
		int a = back();// get the return for the program
		if (!isEmpty()) {
			backOfQueue = backOfQueue.previous;// have the back point to the
												// previous node
			llSize--;// update link list size
			if (isEmpty()) {
				frontOfQueue = null;// make sure front is null if ll is empty
			}
		}
		return a;
	}

	private boolean isFull() {
		return (llSize == MAX_SIZE);
	}

	public boolean isEmpty() {
		// PRECONDITION: The LL has been constructed
		return (llSize == 0);
		// (frontOfQueue == null && backOfQueue == null);
	}

}
