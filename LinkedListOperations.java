package LinkedList;

public class LinkedListOperations {
	 INode head;
	    INode tail;
	    int size;

	    public void addNodeInBeginnig(INode newNode) {

	        if(head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            INode temp = head;
	            head = newNode;
	            head.setNext(temp);
	        }
	        size++;
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

	    public void deleteNodeFromBeginning() {
	        if(head == null)
	            System.out.println("Linked List is empty!");
	        else
	            head = head.getNext();

	        size--;
	    }

	    public void deleteNodeFromLast() {
	        if(head == null)
	            System.out.println("Linked List is empty!");
	        else {
	            INode current = head;
	            while(tail.getNext() != null)
	                current = current.getNext();
	            current.setNext(null);
	        }
	        size--;
	    }

	    public void searchElement() {
	        if(head == null)
	            System.out.println("Linked List is empty");
	        else{
	            INode currentNode = head;
	            int position = 0;
	            while (currentNode != null){
	                position++;
	                if(currentNode.getKey().equals(30)){
	                    System.out.println("Key value 30 is present at position "+position+" in list");
	                }
	                currentNode = currentNode.getNext();
	            }
	        }
	    }

	    public void displayNode(INode node) {
	        INode current = head;

	        if(head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        System.out.println("Nodes of singly linked list: ");
	        while(current != null) {
	            if(current.getNext() != null) {
	                System.out.print(current.getKey() + " -> ");
	                current = current.getNext();
	            }
	            else {
	                System.out.print(current.getKey());
	                break;
	            }
	        }
	        System.out.println();
	    }
	}