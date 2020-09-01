package by.htp.les.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.les.controller.command.impl.SaveNewUserCommand;
import by.htp.les.controller.command.impl.WelcomeNewUserCommand;

public class CommandProvider {

	private Map <ParametrName, Command> commands = new HashMap<ParametrName, Command>();

	public CommandProvider() {
		commands.put(ParametrName.SAVE_NEW_USER, new SaveNewUserCommand());
		commands.put(ParametrName.WELCOME_NEW_USER, new WelcomeNewUserCommand());
	}
	
	public Command getCommand(String commandName) {
		Command command;
		ParametrName valueName;
		
		commandName = commandName.toUpperCase();
		valueName = ParametrName.valueOf(commandName);
		
		command = commands.get(valueName);
		
		return command;
	}
}
