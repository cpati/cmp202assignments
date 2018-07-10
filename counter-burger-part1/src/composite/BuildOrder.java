package composite;

public class BuildOrder {

    public static Component getOrder()
    {
    	String[] burgerOptions= {"Beef","1/3 lb","On a Bun"};
    	String[] cheeseOptions= {"Danish Blue Cheese","Horseradish Cheddar"};
    	String[] toppingsOptions= {"Black Olives","Coleslaw"};
    	String[] sauseOptions= {"Basil Pesto","Honey Mustard"};
        
    	
    	Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
        //Composite customBurger = new Composite( "Build Your Own Burger" ) ;
        Burger customBurger=new Burger("Build Your Own Burger");
        for(int i=0;i<burgerOptions.length;i++) {
        	customBurger.addChild(new Leaf(burgerOptions[i], 0.0 ));
        	customBurger.addOption(new Leaf(burgerOptions[i], 0.0 ));
        }
        
        CheeseDecorator cheeseDecorator=new CheeseDecorator(customBurger);
        for(int i=0;i<cheeseOptions.length;i++) {
        	customBurger.addChild(new Leaf(cheeseOptions[i], 0.0 ));
        	cheeseDecorator.addOption(new Leaf(cheeseOptions[i], 0.0 ));
        }	
        
        ToppingsDecorator toppingsDecorator=new ToppingsDecorator(cheeseDecorator);
        for(int i=0;i<toppingsOptions.length;i++) {
        	customBurger.addChild(new Leaf(toppingsOptions[i], 0.0 ));
        	toppingsDecorator.addOption(new Leaf(toppingsOptions[i], 0.0 ));
        }	
        
        SauseDecorator sauseDecorator=new SauseDecorator(toppingsDecorator);
        for(int i=0;i<sauseOptions.length;i++) {
        	customBurger.addChild(new Leaf(sauseOptions[i], 0.0 ));
        	sauseDecorator.addOption(new Leaf(sauseOptions[i], 0.0 ));
        }	
        
        double price=sauseDecorator.calculatePrice();
        order.addChild( customBurger );
        customBurger.printDescription();
        cheeseDecorator.printDescription();
        toppingsDecorator.printDescription();
        sauseDecorator.printDescription();
        System.out.println("Total Price:"+price);
        return order ;
    }

}


/*
Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square
*/