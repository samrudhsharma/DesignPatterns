
public class ChickenTikkaSandwich extends SandwichBuilder {

	@Override
	public void addBread() {
		sandwich.setBread("Multi Grain");
	}

	@Override
	public void addToppings() {
		sandwich.setToppings("Chicken Tikka + Tomatos + Onion");
	}

	@Override
	public void addSauces() {
		sandwich.setSauces("Chilli Mayo");
	}

}
