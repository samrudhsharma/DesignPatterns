
public class VegSandwich extends SandwichBuilder {

	@Override
	public void addBread() {
	  sandwich.setBread("italian");
	}

	@Override
	public void addToppings() {
      sandwich.setToppings("lettuce + olives + jalapeneos");
	}

	@Override
	public void addSauces() {
		sandwich.setSauces("Honey Mustard");
	}

}
