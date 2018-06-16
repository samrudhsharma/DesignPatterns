
public class DressingsDecorator extends SandwichDecorator {
	public DressingsDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String build() {
		return sandwich.build() + addKetchup();
	}
	private String addKetchup() {
		return " + Ketchup";
	}

}
