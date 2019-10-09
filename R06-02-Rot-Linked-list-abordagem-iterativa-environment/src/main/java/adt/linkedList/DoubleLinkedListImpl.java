package adt.linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements
		DoubleLinkedList<T> {

	protected DoubleLinkedListNode<T> last;

	@Override
	public void insertFirst(T element) {
		if (element != null) {
			if (!isEmpty()) {
				DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>(element, (DoubleLinkedListNode<T>) this.head, new DoubleLinkedListNode<T>());
				head = newNode;
				((DoubleLinkedListNode<T>)newNode.next).previous = newNode;
				size += 1;
			} else {
				this.insert(element);
			}
		}		
	}
	

	@Override
	public void removeFirst() {
		if (!isEmpty()) {
			
			head = head.next;
			((DoubleLinkedListNode<T>) head).previous = new DoubleLinkedListNode<T>();
			size -= 1;
			
			if (size == 0) {
				last = (DoubleLinkedListNode<T>) head;
			}
		}
	}

	@Override
	public void removeLast() {
		if (!isEmpty()) {
			if (size == 1) {
				last.setData(null);
				head = last;
			} else {
				last = last.previous;
				last.next = new DoubleLinkedListNode<>();
			}
			size -= 1;
		}
	}

	public DoubleLinkedListNode<T> getLast() {
		return last;
	}

	public void setLast(DoubleLinkedListNode<T> last) {
		this.last = last;
	}

}
