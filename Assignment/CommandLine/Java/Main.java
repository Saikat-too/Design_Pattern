package Assignment.CommandLine.Java;

public class Main {
    public static void main(String[] args) {
        Executor admin = new Executor(true);
        Executor user = new Executor(false);

        admin.addCommand(new Create("file.txt"));
        admin.addCommand(new Delete("dir"));
        admin.addCommand(new RemoveAll());

        user.addCommand(new Create("file.txt"));
        user.addCommand(new Delete("dir"));
        user.addCommand(new RemoveAll());

        System.out.println("Admin Executor:");
        admin.executeCommands();

        System.out.println("\n User Executor:");
        user.executeCommands();
    }   
}
