package ListLab;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
	
	private Node<T> head;
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	public void add(T obj) {
		Node<T> currentNode = head;
		while(currentNode.hasNext()) {
			currentNode = currentNode.getNext();
		}

		Node<T> nextNode = new Node(obj);
		currentNode.setNext(nextNode);
		size++;
	}
	
	public boolean remove(int index) {
		//todo
		
		if(index < 0 || index > size) {
			return false;
		} else if(index == 0) {
			if(head.next == null) {
				head = null;
			} else {
				head = head.getNext();
			}
		} else {
			Node<T> currentNode = head;
			if (currentNode != null) {
				Node<T> prevNode = null;
				for (int i = 0; i < index; i++) {
					if (currentNode.getNext() == null) {
						return false;
					}
					prevNode = currentNode;
					currentNode = currentNode.getNext();
				}
				prevNode.setNext(currentNode.getNext());
			}
		}
		size--;
		return true;
	}
	
	public T get(int index) {
		//todo
		if (index <0 || index > size) return null;
		int position = 0;
		Node<T> currentNode = head;
		if(currentNode != null) {
			for(int i = 0; i < index; i++) {
				currentNode = currentNode.getNext();
			}
		}
		return currentNode.getData();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}
	
	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;
		
		public MyIterator(Node<T> node) {
			//todo
		}
		@Override
		public boolean hasNext() {
			//todo
			return node.getNext() != null;
		}

		@Override
		public T next() {
			//todo
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
