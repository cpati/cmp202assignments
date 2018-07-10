package composite;

import java.util.ArrayList;
import java.util.List;

public class CheeseDecorator extends BurgerDecorator implements PriceCalculation{

	private Composite composite;
	private List<Leaf> options=new ArrayList<Leaf>();
	
	public CheeseDecorator(String d) {
		super(d);
	}
	
	public CheeseDecorator(Burger composite) {
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
		return this.options.size()*1.0;
	}
	
	public void printDescription() {
        //System.out.println( super.description );
        for (int i=0;i<this.options.size();i++)
        	System.out.println(this.options.get(i).description+':'+1.0);
    }

}
