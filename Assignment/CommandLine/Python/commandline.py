
class Command:
    def execute(self):
        pass
class CreateCommand(Command):
    def __init__(self, name):
        self.name = name

    def execute(self):
        print(f"Creating {self.name}")

class DeleteCommand(Command):
    def __init__(self, name):
        self.name = name

    def execute(self):
        print(f"Deleting {self.name}")

class RemoveAllCommand(Command):
    def execute(self):
        print("Removing all files and directories")
        
class CommandExecutor:
    def __init__(self, is_admin):
        self.is_admin = is_admin
        self.commands = []

    def add_command(self, command):
        if self.is_admin or not isinstance(command, RemoveAllCommand):
            self.commands.append(command)
        else:
            print("Normal users cannot execute the 'rm -rf' command")

    def execute_commands(self):
        for command in self.commands:
            command.execute()


if __name__ == "__main__":
    admin_executor = CommandExecutor(True)
    normal_user_executor = CommandExecutor(False)

    admin_executor.add_command(CreateCommand("file.txt"))
    admin_executor.add_command(DeleteCommand("dir"))
    admin_executor.add_command(RemoveAllCommand())

    normal_user_executor.add_command(CreateCommand("file.txt"))
    normal_user_executor.add_command(DeleteCommand("dir"))
    normal_user_executor.add_command(RemoveAllCommand())

    print("Admin Executor:")
    admin_executor.execute_commands()

    print("\nNormal User Executor:")
    normal_user_executor.execute_commands()