package composite;

public abstract class BurgerDecorator extends Composite{

	private Composite composite;
	
	public BurgerDecorator(String d) {
		super(d);
	}
	
	public BurgerDecorator(Composite composite) {
		super(composite.getDescription());
		this.composite=composite;
	}

}
