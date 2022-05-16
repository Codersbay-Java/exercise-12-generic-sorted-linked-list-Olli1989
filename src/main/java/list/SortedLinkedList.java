package list;

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T>{

	private class Node<T>{
		private final T value;
		private Node next;

		public Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}


	}

	private Node<T> head;
	private int size;

	@Override
	public void insert(T element) {
		size ++;
		Node<T> newNode = new Node<>(element);
		if(isEmpty()){
			head = newNode;
		} else {
				Node<T> current = head;
				Node<T> prev = head;
				while(current!=null && current.getValue().compareTo(element)<0){
					prev = current;
					current = current.getNext();
				}
				if(current == head){
					newNode.setNext(current);
					head = newNode;
				} else {
					prev.setNext(newNode);
					newNode.setNext(current);
				}

		}
	}


	@Override
	public boolean delete(int index) {
		if(isEmpty() || index < 0 || index >= size){
			return false;
		} else if(index == 0){
			head = head.getNext();
		} else {
			Node<T> current = head;
			Node<T> prev = head;
			for (int i = 0; i < index-1; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
		return true;
	}

	@Override
	public T get(int index) {
		if(isEmpty() || index < 0 || index >= size) {
			throw new IllegalArgumentException();
		} else {
			Node<T> current = head;
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}
			return current.getValue();
		}
	}

	@Override
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		String s = "";
		Node<T> current = head;
		while(current != null){
			s+="|" + current.getValue().toString() + "|";
			if(current.getNext()!= null){
				s+= "-->";
			}
			current = current.getNext();
		}
		return s;
	}
}
