package Assignment.CommandLine.Java;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    private List<Command> commands;
    private boolean isAdmin;

    public Executor(boolean isAdmin) {
        this.isAdmin = isAdmin;
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        if (isAdmin || !(command instanceof RemoveAll)) {
            commands.add(command);
        } else {
            System.out.println("Normal users cannot execute the 'rm -rf' command");
        }
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
