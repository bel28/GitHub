package by.bsu.command.command;

import by.bsu.command.ParameterObject;

public class RemoveOrderCommand implements Command{

	private ParameterObject params;
	

	public void execute() {
		
		params.setRemoveOrder(true);
		params.saveToMemento();
		
		//remove order logic
	}

	public void setParams(ParameterObject params) {
		this.params = params;
	}
}
