import java.util.ArrayList;


public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();


    public void addItem(Item item){
        items.add(item);
        total += item.price;
        
    }


    // for(Object Item:items)
    // {
    //    System.out.println(Item);
        
    // }
    
    
    
};
