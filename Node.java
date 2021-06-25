package LinkedList;

public class Node<K> implements INode<K>{
	 K key;
	    INode next;

	    public Node() {
	    }

	    public Node(K key) {
	        this.key = key;
	        this.next = null;
	    }

	    @Override
	    public void setKey(K key) {
	        this.key = key;
	    }

	    @Override
	    public K getKey() {
	        return key;
	    }

	    @Override
	    public void setNext(INode<K> next) {
	        this.next = next;
	    }

	    @Override
	    public INode<K> getNext() {
	        return next;
	    }
	}