import java.util.Date;

class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}

 class User {
    private String name;
 
    public User(String name){
        this.name  = name;
     }

    public String getName() {
       return name;
    }
 
    public void setName(String name) {
       this.name = name;
    }
 
   
 
    public void sendMessage(String message){
       ChatRoom.showMessage(this,message);
    }
 }

public  class Mediator {
    public static void main(String[] args) {
        User Saikat = new User("Saikat");
        User Arpita = new User("Arpita");

        Saikat.sendMessage("Hi ");
        Arpita.sendMessage("Hellow");
    }
}