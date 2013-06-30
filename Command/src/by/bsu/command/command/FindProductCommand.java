package by.bsu.command.command;

import by.bsu.command.ParameterObject;
import by.bsu.command.Product;


public class FindProductCommand implements Command{
	
	private ParameterObject params;
	
	
	public void execute() {
		//stub
		Product prod = new Product();
		prod.setCode(1); prod.setPrice(1500); prod.setName("Mobile");
		//
		params.setResultProduct(prod);
	}
	
	
	public void setParams(ParameterObject params) {
		this.params = params;
	}
}
