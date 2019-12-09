package arvoreBST;

public class BST {
	protected NodeBST root;

	public BST() {
		this.root = new NodeBST();
	}

	public NodeBST getRoot() {
		return this.root;
	}

	public boolean isEmpty() {
		return this.root.isEmpty();
	}

	public int altura(NodeBST node) {
		int alturaEsquerda = -1;
		int alturaDireita = -1;

		while (!node.isEmpty()) {
			alturaEsquerda = 1 + altura(node.getLeft());
			alturaDireita = 1 + altura(node.getRigth());
		}
		if (alturaDireita > alturaEsquerda) {
			return alturaDireita;
		} else {
			return alturaEsquerda;
		}
	}

	public NodeBST procurar(Integer elemento) {
		if (isEmpty()) {
			return new NodeBST();
		}
		return buscar(this.root, elemento);
	}

	private NodeBST buscar(NodeBST node, Integer elemento) {
		if (node.getData().equals(elemento)) {
			return node;
		} else if (node.getData() > elemento) {
			return buscar(node.getLeft(), elemento);
		} else {
			return buscar(node.getRigth(), elemento);
		}
	}

	public void inserir(Integer elemento) {
		if (elemento != null) {
			insert(this.root, elemento);
		}
	}

	private void insert(NodeBST node, Integer elemento) {
		if (node.isEmpty()) {
			node.setData(elemento);
			node.setLeft(new NodeBST());
			node.getLeft().setParent(node);
			node.setRigth(new NodeBST());
			node.getRigth().setParent(node);
		} else if (node.getData() > elemento) {
			insert(node.getLeft(), elemento);
		} else if (node.getData() < elemento) {
			insert(node.getRigth(), elemento);
		}
	}
	
	public NodeBST Minimun() {
		if(isEmpty()) {
			return null;
		}else {
			return minimun(this.root);
		}
	}

	private NodeBST minimun(NodeBST node) {
		if(node.getLeft().isEmpty()) {
			return node;
		}else {
			return minimun(node.getLeft());
		}
	}

}
