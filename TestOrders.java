public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();


        item1.name = "mocha";
        item1.price = 2.99;
        item2.name = "latte";
        item2.price = 3.99;
        item3.name = "drip cofee";
        item3.price = 4.99;
        item4.name = "cappucino";
        item4.price = 5.99;

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        
        
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item2);
        order4.addItem(item2);
        
        
        order1.ready = true;
        order2.ready = true;
        
        
        System.out.println(order4.total);
    }
}