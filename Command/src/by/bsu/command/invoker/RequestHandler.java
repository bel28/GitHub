package by.bsu.command.invoker;

import by.bsu.command.*;
import by.bsu.command.command.*;
public class RequestHandler {
	
	Command command;
	public RequestHandler(Command command) {
		this.command = command;
	}
	
	public void performRequest(ParameterObject po) {
		command.setParams(po);
		command.execute();
	}
}
