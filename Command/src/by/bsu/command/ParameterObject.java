package by.bsu.command;

public class ParameterObject {

	private final static ParameterObject instance = new ParameterObject();

	private ParameterObject() {
	}

	public static ParameterObject getInstance() {
		return instance;
	}

	private Order order;
	private int codeOfProduct;
	private Product resultProduct;
	private boolean removeOrder;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getCodeOfProduct() {
		return codeOfProduct;
	}

	public void setCodeOfProduct(int codeOfProduct) {
		this.codeOfProduct = codeOfProduct;
	}

	public Product getResultProduct() {
		return resultProduct;
	}

	public void setResultProduct(Product product) {
		this.resultProduct = product;
	}

	public boolean isRemoveOrder() {
		return removeOrder;
	}

	public void setRemoveOrder(boolean removeOrder) {
		this.removeOrder = removeOrder;
	}

	public void saveToMemento() {

		undo = new Memento(order, removeOrder);
	}

	private Memento undo;

	public void restoreFromMemento() {
		order = undo.getSavedState();
		removeOrder = undo.isRemoving();

	}

	private class Memento {
		private final Order state;
		private final boolean removeOrder;

		public Memento(Order stateToSave, boolean removing) {
			state = stateToSave;
			removeOrder = removing;
		}

		public Order getSavedState() {
			return state;
		}

		public boolean isRemoving() {
			return removeOrder;
		}
	}

}
