import java.util.ArrayList;
import java.util.List;

interface Market{
    public void update(String market , double MarketPrice);
}

class User implements Market {
    private String name ; 
    
    public User(String name) {
        this.name = name ;
    }

   

    @Override
    public void update(String market , double MarketPrice) {
        System.out.println(" Hellow :" + name + " The " + market + "has been updated by " );
        System.out.println("The current new marketprice is : " + MarketPrice);

    }

}

interface Updater{
    public void addUser(Market market);
    public void removeUser(Market market);
    public void notifyUser();  
}

class Stock implements Updater {
    public List<Market> markets = new ArrayList<>();
    private String content ;
    private double MarketPrice ;
    public void setContent(String content , double MarketPrice){
        this.content = content ;
        this.MarketPrice = MarketPrice ; 
        notifyUser();
    }
    @Override
    public void addUser(Market market) {
        markets.add(market);
    }
    @Override
    public void removeUser(Market market) {
        markets.add(market);
    }
    @Override
    public void notifyUser() {
        for (Market market : markets ){
            market.update(content , MarketPrice);
        }
    }

    

}



/**
 * StockMarket
 */
public class StockMarket {

    public static void main(String[] args) {
         double MarketPrice = 300 ;
       User user1 = new User("Pedri");
       User user2 = new User("Messi");

       Stock stock = new Stock();

       stock.addUser(user2);
       stock.addUser(user1);

       stock.setContent("Dropped" , MarketPrice-20);
       MarketPrice = MarketPrice-20;

       stock.setContent("Rise" , MarketPrice+20 );
       MarketPrice = MarketPrice+20;
        
        
    }
    
}