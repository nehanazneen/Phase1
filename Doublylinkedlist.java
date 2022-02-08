package DLs;

public class Doublylinkedlist {

	public static void main(String[] args) {
		Doublylinkedlist list= new Doublylinkedlist();
		list.add(2);
		list.add(4);
		list.add(7);
		list.display();
		list.add(2);
		
		list.display();
		
		
}
}
class Node{
	Node previousAddress;
	int data;
	Node nextAddress;
}

class Doublylinkedlist {
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public void add (int value) {
		Node node= new Node ();
		node.data=value;
		node.priviousAddress= null;
		node.nextAddress= null;
		
		if (head==null) {
			head=nodes;
			tail=nodes;
			
		}else {
			tail.nextAddress=nodes;
			node.previousAddress =tail;
			tail=nodes;
		}
	}
	public void displayInReverse();
	 Node temp=head;
	
	
}