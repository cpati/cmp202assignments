package composite;

import java.util.ArrayList;
import java.util.List;

public class SauseDecorator extends BurgerDecorator implements PriceCalculation{

	private Composite composite;
	private List<Leaf> options=new ArrayList<Leaf>();
	
	public SauseDecorator(String d) {
		super(d);
	}
	
	public SauseDecorator(Composite composite) {
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
		return this.options.size()*0.75;
	}

	public void printDescription() {
        System.out.println( super.description );
        for (int i=0;i<this.options.size();i++)
        	System.out.println(this.options.get(i).description+':'+this.options.get(i).price);
    }
}
