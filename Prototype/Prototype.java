
import java.util.Hashtable;


abstract  class Shape implements  Cloneable{
    private String id ;
    protected String type ; 

   

    public String getType(){

        return type;
    }

    public String getId(){

        return id ; 
    }

    public void setType(String type){
        this.type = type;
    }

    public void setId(String id ){
        this.id = id ; 
    }

    @Override
    public Object clone() {
        Object clone = null ;

        try {
            clone  = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone ; 
    }
}

class Rectangle extends  Shape {

    public Rectangle() {
        type  = "Rectangle";
    }
   
}

class Circle extends  Shape{
    
    public Circle () {
        type = "Circle";
    }

   
}

class ShapeCache {
    public static Hashtable<String , Shape> shapeMap = new Hashtable<String , Shape>();

    public static Shape getShape(String shapeID){
        Shape cahchshape = shapeMap.get(shapeID);
        return (Shape) cahchshape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId() , circle);

        Rectangle rectangle = new Rectangle() ;
        rectangle.setId("2");
        shapeMap.put(rectangle.getId() , rectangle);

    }
}
/**
 * Prototype
 */
public class Prototype {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + cloneShape.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + cloneShape2.getType());

    }
    
}