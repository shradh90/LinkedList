package LinkedList;

public class LinkedListOperations {
	 INode head;
	    INode tail;
	    int size;

	    public void addNodeInBeginnig(Node newNode) {
	        if(head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            INode temp = head;
	            head = newNode;
	            head.setNext(temp);
	        }
	    }

	    public void addNodeAtEnd(Node newNode) {
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            tail.setNext(newNode);
	            tail = newNode;
	        }
	        size++;
	    }

	    public void addNodeInMiddle(Node newNode) {

	        if(head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            INode temp, current = null;
	            int count = (size % 2 == 0) ? (size/2) : ((size + 1) / 2);
	            temp = head;
	            //current = null;
	            for(int i=0; i<count; i++) {
	                current = temp;
	                temp = temp.getNext();
	            }
	            current.setNext(newNode);
	            newNode.setNext(temp);
	        }
	        size++;
	    }

	    public void addNodeInPosition(Integer element, int position) {
	        if (position < 0 || position > size)
	            System.out.println("Index out of bound!");
	        else if(position==1){
	            Node newNode = new Node(element);
	            newNode.setNext(head.getNext());
	            head.setNext(newNode);
	        }
	        else {
	            INode currentNode = head;
	            while (currentNode != null){
	                if(currentNode.getKey().equals(30)) {
	                    Node newNode = new Node(element);
	                    newNode.setNext(currentNode.getNext());
	                    currentNode.setNext(newNode);
	                    break;
	                }
	                currentNode = currentNode.getNext();
	            }
	        }
	        size ++;
	    }

	 
	    public void displayNode() {
	        INode current = head;
	        if(head == null)
	            System.out.println("Linked List is empty");
	        System.out.print("Nodes are: " );
	        while (current != null) {
	            if(current.getNext() != null) {
	                System.out.print(current.getKey() + " -> ");
	                current = current.getNext();
	            }
	            else {
	                System.out.println(current.getKey());
	                current = current.getNext();
	            }
	        }
	    }
	}
