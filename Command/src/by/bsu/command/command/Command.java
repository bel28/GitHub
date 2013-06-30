package by.bsu.command.command;

import by.bsu.command.ParameterObject;

public interface Command {
	
    public void execute();
    public void setParams(ParameterObject params);
}

