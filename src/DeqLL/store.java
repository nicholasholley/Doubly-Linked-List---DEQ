package DeqLL;

public class Deq{

	private Node frontOfQueue, backOfQueue;// Points to the top of the stack
	int llSize = 0;
	public Deq() {
		frontOfQueue = null;
		backOfQueue = null;
	} // Constructor of Queue

	public void addToFront(int x) {
		//PRECONDITION: the LL is not full
		Node aNode = new Node(x, frontOfQueue, null);
		if(isEmpty()){
			backOfQueue = aNode;
		}
		else{
			frontOfQueue.previous = aNode;
		}
		aNode.next = frontOfQueue;
		frontOfQueue = aNode;
		llSize++;
	}
	
	public void addToBack(int x) {
		//PRECONDITION: the LL is not full
		frontOfQueue = new Node(x, null, backOfQueue);
		llSize++;
		if(isEmpty()){
			frontOfQueue = backOfQueue;
		}
	}

	private int front() {
		return frontOfQueue.d;
	}
	
	private int back() {
		return backOfQueue.d;
	}

	public int removeFromFront() {
		//PRECONDIITON: The LL is not empty
		if(!isEmpty()){
		int n = front();
		frontOfQueue = frontOfQueue.next;
		llSize--;
		if(isEmpty()){
			backOfQueue = null;
		}
		return n;}
		else{return (Integer) null;}
	}
	
	public int removeFromBack() {
		//PRECONDIITON: The LL is not empty
		if(!isEmpty()){
		int a = back();
		backOfQueue = backOfQueue.previous;
		llSize--;
		if(isEmpty()){
			frontOfQueue = null;
		}
		return a;}
		else{return (Integer) null;}
		
	}

	private boolean isFull() {
		//PRECONDITION: The LL never fills up
		return false;
	}

	public boolean isEmpty() {
		//PRECONDITION: The LL has been constructed
		return (frontOfQueue == null && backOfQueue == null);
	}

}
package DeqLL;

public class store {

}
