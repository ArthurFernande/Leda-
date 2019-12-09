package LidtsEncadeada;

public class singleList {
	protected Node head;
	protected Integer size;
	
	public singleList() {
		this.size=0;
		this.head= new Node();
	}
	public boolean isEmpty() {
		return this.head.isNILL();
	}
	
	public void inserir(Integer elemento) {
		Node newNode= new Node();
		if(isEmpty()) {
			this.head =newNode;
		}else {
			Node auxiliar = head;
			while(auxiliar.next !=null) {
				auxiliar=auxiliar.next;
			}
			auxiliar.next=newNode;
		}
		
		this.size++;
	}
	
	public Node procurar(Integer elemento) {
		Node auxiliar=head;
		while (auxiliar !=null && auxiliar.getData() !=elemento) {
			auxiliar=auxiliar.next;
			
		}
		return auxiliar;
	}
	
	public void remove(Integer elemento) {
		if(!isEmpty()) {
			if(this.head.getData().equals(elemento)) {
				this.head=head.next;
				this.size--;
			}else {
				Node auxiliar = head;
				Node auxiliar2 = head.next;
				while(!auxiliar2.isNILL() && !auxiliar2.getData().equals(elemento) ) {
					auxiliar =auxiliar2;
					auxiliar2=auxiliar2.next;
				}
				if(!auxiliar.isNILL()) {
					auxiliar.setNext(auxiliar2.getNext());
					this.size--;
				}
			}
		}
	}

}
