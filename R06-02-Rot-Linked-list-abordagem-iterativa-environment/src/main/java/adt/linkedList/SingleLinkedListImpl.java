package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;
	int size;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return this.head.isNIL();
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public T search(T element) {
		SingleLinkedListNode<T> auxiliar = head;
		while (!auxiliar.isNIL() && !(auxiliar.getData().equals(element))) {
			auxiliar = auxiliar.getNext();
		}
		return auxiliar.getData();
	}

	@Override
	public void insert(T element) {

		SingleLinkedListNode<T> node = new SingleLinkedListNode<T>();
		SingleLinkedListNode<T> newNode = new SingleLinkedListNode<T>(element, node);

		if (element != null) {
			if (isEmpty()) {
				this.head = newNode;
			} else {
				SingleLinkedListNode<T> auxiliar = head;

				while (!auxiliar.getNext().isNIL()) {
					auxiliar = auxiliar.getNext();
				}
				auxiliar.setNext(newNode);
			}
			this.size += 1;
		}
	}

	@Override
	public void remove(T element) {
		if (element != null) {
			if (!this.isEmpty()) {
				if (this.head.getData().equals(element)) {
					this.head = head.getNext();
					this.size -= 1;
				} else {

					SingleLinkedListNode<T> previous = head;
					SingleLinkedListNode<T> auxiliar = head.getNext();

					while (!auxiliar.isNIL() && !(auxiliar.getData().equals(element))) {
						previous = auxiliar;
						auxiliar = auxiliar.getNext();
					}

					if (!auxiliar.isNIL()) {
						previous.setNext(auxiliar.getNext());
						this.size -= 1;
					}
				}
			}
		}
	}

	@Override
	public T[] toArray() {
		T[] array = (T[]) new Object[this.size()];
		SingleLinkedListNode<T> tmp = head;
		int indice = 0;

		while (!tmp.isNIL()) {
			array[indice++] = tmp.getData();
			tmp = tmp.getNext();
		}
		return array;
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}