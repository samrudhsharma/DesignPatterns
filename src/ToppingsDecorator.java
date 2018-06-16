
public class ToppingsDecorator extends SandwichDecorator {

	public ToppingsDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String build() {
		return sandwich.build() + addMeat() + addSalad();
	}
	private String addSalad() {
		return " + salad";
	}
	private String addMeat() {
		return " + chicken";
	}
}
