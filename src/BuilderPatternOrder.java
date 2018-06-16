// This is the main builder class which is responsible for building the different types of complex objects
// The client only accesses this class to build the typoe of object they require
public class BuilderPatternOrder {
  
  private SandwichBuilder sandwichBuilder;
  
  public void typeOfSandwich(SandwichBuilder type) {
	sandwichBuilder = type;
  }
  
  public void orderSandwich() {
	sandwichBuilder.createNewSandwich();
	sandwichBuilder.addBread();
	sandwichBuilder.addToppings();
	sandwichBuilder.addSauces();
  }
  
  public BuilderPatternSandwich deliverSandwich() {
	return sandwichBuilder.getSandwich();
  }
}
