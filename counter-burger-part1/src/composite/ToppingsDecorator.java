package composite;

import java.util.ArrayList;
import java.util.List;

public class ToppingsDecorator extends BurgerDecorator implements PriceCalculation{

	private Composite composite;
	private List<Leaf> options=new ArrayList<Leaf>();
	
	public ToppingsDecorator(String d) {
		super(d);
	}
	
	public ToppingsDecorator(Composite composite) {
		super(composite.getDescription());
		this.composite=composite;
	}
	
	public void addOption(Leaf option) {
		this.options.add(option);
	}
	
	public double calculatePrice() {
		return this.composite.calculatePrice()+getPrice();	
	}
	
	private double getPrice() {
		double price=0.0;
		for (int i=0;i< this.options.size();i++) {
			if (DPConstants.REGULAR_TOPPINGS.contains(this.options.get(i).description)) {
				price=price+DPConstants.REGULAR_TOPPINGS_PRICE;
				this.options.get(i).price=DPConstants.REGULAR_TOPPINGS_PRICE;
			}	
			else if (DPConstants.PREMIUM_TOPPINGS.contains(this.options.get(i).description)) {
				price=price+DPConstants.PREMIUM_TOPPINGS_PRICE;
				this.options.get(i).price=DPConstants.PREMIUM_TOPPINGS_PRICE;
			}	
		}
		return price;
	}
	
	public void printDescription() {
        //System.out.println( super.description );
        for (int i=0;i<this.options.size();i++)
        	System.out.println(this.options.get(i).description+':'+this.options.get(i).price);
    }

}
