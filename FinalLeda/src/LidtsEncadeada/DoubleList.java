package LidtsEncadeada;

public class DoubleList extends singleList {
	protected Node head;
	protected Node last;
	protected int size;

	public DoubleList() {
		this.head = new Node();
		this.last = head;

	}

	public Node procurar(Integer elemento) {
		Node aux = head;
		Node auxLast = last;
		Node saida = null;
		while (aux != null && aux.next != auxLast && aux.getData() != elemento && auxLast.getData() != elemento) {
			aux = aux.next;
			auxLast = aux.previous;
		}

		if (aux.getData() == elemento) {
			saida = aux;
		}
		if (auxLast.getData() == elemento) {
			saida = auxLast;
		}
		return saida;
	}

	public void inserirFim(Integer elemento) {
		Node Node = new Node();
		if (elemento != null) {
			Node newNode = new Node(elemento, Node, new Node());
			super.head = newNode;
			this.last = newNode;
		} else {
			Node newNode = new Node(elemento, Node, this.last);
			this.last.next = newNode;
			this.last = newNode;
		}
		super.size++;
	}

	public void inserirInicio(Integer elemento) {
		Node Node = new Node();
		if (elemento != null) {
			if (!isEmpty()) {
				Node newNode = new Node(elemento, Node, this.head);
				head = newNode;
				newNode.next.previous = newNode;
				size++;
			}
		} else {
			inserirFim(elemento);
		}

	}
	
	public void removerChave(Integer elemento) {
		Node noderemove = procurar(elemento);
		if(noderemove !=null) {
			noderemove.next.previous =noderemove.previous;
			noderemove.previous.next=noderemove.next;
			this.size--;
		}
	}

}
