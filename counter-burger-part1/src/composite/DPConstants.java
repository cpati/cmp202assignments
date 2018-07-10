package composite;

import java.util.Arrays;
import java.util.List;

public class DPConstants {
	public static final double REGULAR_TOPPINGS_PRICE=0.75;
	public static final double PREMIUM_TOPPINGS_PRICE=1.50;
	private static String[] regularToppings= {"Black Olives","Coleslaw"};
	private static String[] premiumToppings= {"Avocado","Fried Egg"};
	public static final List<String> REGULAR_TOPPINGS=Arrays.asList(regularToppings);
	public static final List<String> PREMIUM_TOPPINGS=Arrays.asList(premiumToppings);

}
