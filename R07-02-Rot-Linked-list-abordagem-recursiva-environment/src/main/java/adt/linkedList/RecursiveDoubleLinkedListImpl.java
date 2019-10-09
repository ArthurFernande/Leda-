package adt.linkedList;

public class RecursiveDoubleLinkedListImpl<T> extends RecursiveSingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	protected RecursiveDoubleLinkedListImpl<T> previous;
	
	public RecursiveDoubleLinkedListImpl() {

	}

	public RecursiveDoubleLinkedListImpl(T data, RecursiveSingleLinkedListImpl<T> next,
			RecursiveDoubleLinkedListImpl<T> previous) {
		super(data, next);
		this.previous = previous;
	}

	@Override
	public void insertFirst(T element) {
		if (element != null) {
			RecursiveDoubleLinkedListImpl node = new RecursiveDoubleLinkedListImpl<T>(this.data, this.next, this);
			this.next = node;
			this.data = element;
		}

	}

	@Override
	public void removeFirst() {
		if (!isEmpty()) {
			if (this.next.isEmpty()) {
				this.data = null;
				this.next = null;
			} else {
				this.data = this.next.getData();
				this.next = this.next.getNext();
			}
		}
	}

	@Override
	public void removeLast() {
		if (this.next != null) {

			if (this.next.isEmpty()) {

				this.data = null;
				this.next = null;

			} else {

				((RecursiveDoubleLinkedListImpl<T>) next).removeLast();
			}
		}
	}

	public RecursiveDoubleLinkedListImpl<T> getPrevious() {
		return previous;
	}

	public void setPrevious(RecursiveDoubleLinkedListImpl<T> previous) {
		this.previous = previous;
	}

}
