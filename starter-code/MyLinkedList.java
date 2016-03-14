package ListLab;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
	
	private Node<T> head;
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	public void add(T obj) {
		//todo
		size++;
	}
	
	public boolean remove(int index) {
		//todo
		size--;
		return true;
	}
	
	public T get(int index) {
		//todo
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
