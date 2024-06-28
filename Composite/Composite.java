import java.util.ArrayList;
import java.util.List;

abstract class Component {
    protected  String name ;

    public Component(String name){
        this.name = name ;
    }
    
    public abstract  void add(Component c);
    public abstract void remove (Component c);
    public abstract void display(int depth);

}

class Leaf extends Component {
    public Leaf(String name){
        super(name);
    }

    @Override
    public void add (Component c){
        System.out.println("Cannot add to the leaf system");
    }

    @Override
    public void remove(Component c){
        System.out.println("Cannot remove to the leaf system");
    }

    @Override
    public void display(int depth){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i<depth ; i++){
            sb.append("-");
        }

        System.out.println(sb.toString() + name);
    }
}

class CompositeDemo extends Component {
    private List<Component> children = new ArrayList<>();

    public CompositeDemo(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);

        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
/**
 * Composite
 */
public class Composite {

    public static void main(String[] args) {
        CompositeDemo root = new CompositeDemo("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        CompositeDemo comp = new CompositeDemo("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);
        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }

}