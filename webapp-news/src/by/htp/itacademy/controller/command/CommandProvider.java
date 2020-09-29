package by.htp.itacademy.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.itacademy.controller.command.impl.SaveNews;
import by.htp.itacademy.controller.command.impl.ShowNews;

public class CommandProvider {

	private Map <ParameterName, Command> commands = new HashMap<ParameterName, Command>();

	public CommandProvider() {
		commands.put(ParameterName.SAVE_NEWS, new SaveNews());
		commands.put(ParameterName.SHOW_NEWS, new ShowNews());
	}
	
	public Command getCommand(String commandName) {
		Command command;
		ParameterName valueName;
		
		commandName = commandName.toUpperCase();
		valueName = ParameterName.valueOf(commandName);
		
		command = commands.get(valueName);
		
		return command;
	}
}
