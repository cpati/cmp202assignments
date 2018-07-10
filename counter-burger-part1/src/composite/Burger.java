package composite;

import java.util.ArrayList;
import java.util.List;

public class Burger extends Composite{

	private List<Leaf> options=new ArrayList<Leaf>();
	
	public Burger(String d) {
		super(d);
	}

	public void addOption(Leaf option) {
		this.options.add(option);
	}
	
	public double calculatePrice() {
		return getPrice();
		
	}
	private double getPrice() {
		double price=0.0;
		if (this.options.size() < 2 )
			return price;
		
		if (options.get(1).description.equals("1/3 lb")) {
			price=price+9.5;
			options.get(1).price=9.5;
		}	
		else if (options.get(1).description.equals("2/3 lb")) {
			price=price+11.5;
			options.get(1).price=11.5;
		}	
		else if (options.get(1).description.equals("1 lb")) {
			price=price+15.5;
			options.get(1).price=15.5;
		}	
		
		if (options.get(2).description.equals("In a Bowl")) {
			price=price+1.0;
			options.get(2).price=1.0;
		}	
		
		return price;
	}
	
	public void printDescription() {
        System.out.println( super.description );
        for (int i=0;i<this.options.size();i++)
        	System.out.println(this.options.get(i).description+':'+Double.toString(this.options.get(i).price));
    }
}
