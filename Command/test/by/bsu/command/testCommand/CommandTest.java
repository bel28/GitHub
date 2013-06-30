package by.bsu.command.testCommand;

import static org.junit.Assert.*;
import org.junit.Test;

import by.bsu.command.ParameterObject;

import by.bsu.command.command.Command;
import by.bsu.command.commandmap.RequestHelper;
import by.bsu.command.invoker.*;

public class CommandTest {

	@Test
	public void findProduct() {

		RequestHelper requestHelper = RequestHelper.getInstance();
		ParameterObject parameterWrapper=ParameterObject.getInstance();
		parameterWrapper.setCodeOfProduct(1);
		Command abstractCommand = requestHelper.getCommand("findProduct");
		RequestHandler rh = new RequestHandler(abstractCommand);
		rh.performRequest(parameterWrapper);
		System.out.println(parameterWrapper.getResultProduct().getName());
		assertEquals("Mobile", parameterWrapper.getResultProduct().getName());

	}

}