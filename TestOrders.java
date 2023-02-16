public class TestOrders {
    public static void main(String[] args) {

        //Messages
        String readyMessage = " ,your order is ready.";
        String notReadyMessage = " ,your order is still in progress, thank you for your patience.";
        
        //Menu Items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.5;

        Item item3 = new Item();
        item3.name = "drip";
        item3.price = 6;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 7.25;

        // ORDERS
        Order order1 = new Order();
        order1.name = "Chindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        //Predict what will happen if you print order1.total
        //Nothing as is, we haven't assigned any items yet to order1

        //Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("%s, your total is %s.\n", order2.name, order2.total);
        //order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("%s, your current tab is %s.\n", order3.name, order3.total);

        //order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("%s, thank you for ordering a %s, your total is %s. \n", order4.name, order4.items.get(0).name, order4.total);
        //Cindhuri’s order is now ready. Update her status.
        order1.ready = true;
        if(order1.ready) {
            System.out.println(order1.name + readyMessage);
        }
        else {
            System.out.println(order1.name + notReadyMessage);
        }
        
        //Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        for(int i = 0; i < order4.items.size(); i++){
        }
        System.out.println(order4.name + " your current order contains, " + order4.items.get(0).name + " " + order4.items.get(1).name + " " + order4.items.get(2).name);

        //Jimmy’s order is now ready. Update his status.
        order2.ready = true;
        if(order2.ready){
            System.out.println(order2.name + readyMessage);
        }
        else {
            System.out.println(order2.name + notReadyMessage);
        }
    }
}