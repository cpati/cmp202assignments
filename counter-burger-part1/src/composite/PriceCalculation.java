package composite;

public interface PriceCalculation {
	void addOption(Leaf option);
    double calculatePrice();
}
