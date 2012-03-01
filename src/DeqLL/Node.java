package DeqLL;

public class Node {
	
	int d; //The data
	Node next; //The "pointer" to the next node
	Node previous; //The "pointer" to the previous node
	//The constructor
	public Node(int x, Node n, Node p){
		this.d = x;
		this.next = n;
		this.previous = p;
		}//Constructor of Node
}
