//. The Abstract Builder class for the sandwich, provides the basic functionalities but also allows to be built upon by concrete classes extending it
public abstract class SandwichBuilder {
  
	protected BuilderPatternSandwich sandwich;

    public BuilderPatternSandwich getSandwich() {
    	System.out.println("Your order: ");
    	System.out.println("Bread: "+ sandwich.getBread());
    	System.out.println("Toppings: "+ sandwich.getToppings());
    	System.out.println("Sauces: "+ sandwich.getSauces());
        return sandwich;
    }

    public void createNewSandwich() {
    	sandwich = new BuilderPatternSandwich();
    }

    public abstract void addBread();
    public abstract void addToppings();
    public abstract void addSauces();
}
