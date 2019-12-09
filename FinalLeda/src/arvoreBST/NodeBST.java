package arvoreBST;

public class NodeBST {
	protected Integer data;
	protected  NodeBST left;
	protected  NodeBST rigth;
	protected  NodeBST parent;

	public boolean isEmpty() {
		return this.data==null;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public NodeBST getLeft() {
		return left;
	}

	public void setLeft(NodeBST left) {
		this.left = left;
	}

	public NodeBST getRigth() {
		return rigth;
	}

	public void setRigth(NodeBST rigth) {
		this.rigth = rigth;
	}

	public NodeBST getParent() {
		return parent;
	}

	public void setParent(NodeBST parent) {
		this.parent = parent;
	}
}
