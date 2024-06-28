
class Computer {
    private String CPU ; 
    private String RAM ; 
    private String storage;
    private String GPU ;

    public void setCPU(String CPU) { 
        this.CPU = CPU ;
    }

    public void setRAM(String RAM){
        this.RAM = RAM ;
    }

    public void serStorage(String storage){
        this.storage = storage;
    }

    public void setGPU(String GPU){
        this.GPU = GPU ;
    }
    
    @Override
    public String toString() {
        return "Computer { " + "CPU= " + CPU + " , RAM=" + RAM + " , Storage= " + storage + " , GPU= " + GPU + '}';
    }
}

interface ComputerBuilder{

    void buildCPU(String CPU);
    void buildRAM(String RAM);
    void buildStorage(String storage);
    void buildGPU(String GPU);
    Computer getResult();
}

class DesktopComputerBuilder implements ComputerBuilder {

    private Computer computer ; 

    public DesktopComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void buildCPU(String CPU){
        computer.setCPU(CPU);
    }
    @Override
    public void buildRAM(String RAM){
        computer.setRAM(RAM);
    }
    @Override
    public void buildStorage(String storage){
        computer.serStorage(storage);
    }
    @Override
    public void buildGPU(String GPU){
        computer.setGPU(GPU);
    }

    @Override
    public Computer getResult(){
       return   computer ; 
    }
}

class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructGamingPC() {
        computerBuilder.buildCPU("Intel i9");
        computerBuilder.buildRAM("32GB DDR4");
        computerBuilder.buildStorage("1TB NVMe SSD");
        computerBuilder.buildGPU("NVIDIA RTX 3080");
    }

    public void constructOfficePC() {
        computerBuilder.buildCPU("Intel i5");
        computerBuilder.buildRAM("16GB DDR4");
        computerBuilder.buildStorage("512GB SSD");
        computerBuilder.buildGPU("Integrated Graphics");
    }
}
/**
 * Builder
 */
public class Builder {

    public static void main(String[] args) {
        ComputerBuilder builder = new DesktopComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        director.constructGamingPC();
        Computer gamingPC = builder.getResult();
        System.out.println("Gaming PC: " + gamingPC);

        director.constructOfficePC();
        Computer officePC = builder.getResult();
        System.out.println("Office PC: " + officePC);
    }
}
