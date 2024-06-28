 class  SingleObject {
    private static SingleObject instance = new SingleObject();
   

    private SingleObject(){}

    public static SingleObject getInstance(){
        if (instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

public class Singleton {

    public static void main(String[] args) {
        
        SingleObject obj =  SingleObject.getInstance();

        obj.showMessage();
    }

    
}
