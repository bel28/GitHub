package by.bsu.command.commandmap;

import java.util.HashMap;

import by.bsu.command.command.Command;
import by.bsu.command.command.CancelLastOrderCommand;
import by.bsu.command.command.FindProductCommand;
import by.bsu.command.command.MakeOrderCommand;
import by.bsu.command.command.RemoveOrderCommand;

public final class RequestHelper {

    private final static RequestHelper instance = new RequestHelper();
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    private RequestHelper() {
        commands.put("makeOrder", new MakeOrderCommand());
        commands.put("findProduct", new FindProductCommand());
        commands.put("removeOrder", new RemoveOrderCommand());
        commands.put("cancelOrder", new CancelLastOrderCommand());  
    }

    public static RequestHelper getInstance() {
        return instance;
    }

    public Command getCommand(String action) {
        Command command = commands.get(action);
        
        return command;
    }
}