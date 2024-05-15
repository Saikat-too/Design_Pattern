package Assignment.CommandLine.Java;

public class Create implements Command {
    
    private String name;

    public Create(String name){
        this.name = name;
    }

    public void execute(){
        System.out.println("Creating" + name);
    }
}
