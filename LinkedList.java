package LinkedList;

import java.util.Scanner;

public class LinkedList {
	 static Scanner input = new Scanner(System.in);

	    public static void main(String[] args) {
	        LinkedListOperations operations = new LinkedListOperations();
	        INode headNode = null;

	        Node<Integer> myFirstNode = new Node<>(56);
	        Node<Integer> mySecondNode = new Node<>(30);
	        Node<Integer> myThirdNode = new Node<>(70);

	        boolean flag = true;
	        while (flag) {
	            int option = inputMenu();
	            switch(option) {
	                case 1:
	                    operations.addNodeInBeginnig(myFirstNode);
	                    flag = true;
	                    break;
	                case 2:
	                    operations.addNodeAtEnd(myThirdNode);
	                    flag = true;
	                    break;
	                case 3:
	                    System.out.println("Enter the data you want to add");
	                    Integer element = input.nextInt();
	                    System.out.println("Enter the position where you want to add the data ");
	                    int position = input.nextInt();
	                    operations.addNodeInPosition(element, position);
	                    flag = true;
	                    break;
	                case 4:
	                    operations.deleteNodeFromBeginning();
	                    flag = true;
	                    break;
	                case 5:
	                    operations.deleteNodeFromLast();
	                    flag = true;
	                    break;
	                case 6:
	                    System.out.println("Enter the data you want to delete");
	                    Integer value = input.nextInt();
	                    operations.deleteNodeFromPosition(value);
	                    flag = true;
	                    break;
	                case 7:
	                    operations.displayNode(headNode);
	                    flag = true;
	                    break;
	                case 8:
	                    operations.searchElement();
	                    flag = true;
	                    break;
	                case 9:
	                    System.out.println("Enter the data you want to add");
	                    Integer element1 = input.nextInt();
	                    operations.insertSortedList(element1);
	                    flag = true;
	                    break;
	                case 10:
	                    flag = false;
	                    break;
	            }
	        }
	    }
	    public static int inputMenu() {

	        System.out.println();
	        System.out.println("Enter options to perform operations in Linked List");
	        System.out.println("Press 1 to Add Node in the Beginning");
	        System.out.println("Press 2 to Add Node at the End");
	        System.out.println("Press 3 to Add Node in the Between the List");
	        System.out.println("Press 4 to Delete Node from the Beginning");
	        System.out.println("Press 5 to Delete Node from the End");
	        System.out.println("Press 6 to Delete Node from the Middle");
	        System.out.println("Press 7 to Display the Linked List");
	        System.out.println("Press 8 to Search Node in the Linked List");
	        System.out.println("Press 9 to Insert Sorted Data in the Linked List");
	        System.out.println("Press 10 to Quit");

	        int value = input.nextInt();

	        return value;
	    }
	}

	   