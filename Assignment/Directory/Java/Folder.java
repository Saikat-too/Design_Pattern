package Assignment.Directory.Java;
import java.util.ArrayList;
import java.util.List;
public class Folder implements Storage {
     
    private String name;
    private List<Storage> children;
    public Folder(String name){
        this.name = name;
        children = new ArrayList<>();
    }
    public void add(Storage component){
        children.add(component);
    }
    public void remove(Storage component){
        children.remove(component);
    }
    public List<Storage>getChildren(){
        return children;
    }
    public String getFolderName(){
        return name;
    }
    public long size(){
        int size = 0;
		for (Storage ele : children) {
			size += ele.size();
		}
		System.out.println(">>> Folder " + name + ", size: " + size);
		return size;
    }
}
