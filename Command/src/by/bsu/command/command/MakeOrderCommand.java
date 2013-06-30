package by.bsu.command.command;

import by.bsu.command.ParameterObject;

public final class MakeOrderCommand implements Command{

	private ParameterObject params;
	
	public void execute() {
		
		params.setRemoveOrder(false);
		params.saveToMemento();
		
		//make order code
	}
	
	public void setParams(ParameterObject params) {
		this.params = params;
	}
}
