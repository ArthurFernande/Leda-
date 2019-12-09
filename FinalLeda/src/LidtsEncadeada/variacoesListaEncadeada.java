package LidtsEncadeada;

public class variacoesListaEncadeada extends singleList {

	public Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;

		return node;
	}

	public void swap(Integer elemen1, Integer elemen2) {
		Node auxiliar = head;

		Node nodeelemet1 = null;
		Node nodeelemet2 = null;

		while (!auxiliar.isNILL()) {
			if (auxiliar.getData().equals(elemen1)) {
				nodeelemet1 = auxiliar;
			} else if (auxiliar.getData().equals(elemen2)) {
				nodeelemet2 = auxiliar;
			}
			auxiliar = auxiliar.getNext();
		}
		if (nodeelemet1 != nodeelemet2) {
			Integer auxvalue = nodeelemet1.getData();
			nodeelemet1.setData(nodeelemet2.getData());
			nodeelemet2.setData(auxvalue);
		}
	}
	
	public Integer kesimo(Integer k) {
		if(!isEmpty()) {
			Node aux =this.head;
			Node auxResult =this.head;
			Integer valor =null;
			int contador =1;
			
			while(!aux.isNILL()) {
				if(contador >= k) {
				//	valor =auxResult;
					auxResult= auxResult.getNext();
				}
				aux =aux.getNext();
				contador++;
			}
			return valor;
		}else {
			return null;
		}
	}

}
