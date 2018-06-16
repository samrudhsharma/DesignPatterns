// A basic implementation of the product (sandwich) object we are trying to build
public class BuilderPatternSandwich implements Product {
	
	private String bread = "";
    private String toppings = "";
    private String sauces = "";
	
	@Override
	public void setBread(String bread) {
	  this.bread = bread;
	}

	@Override
	public void setToppings(String toppings) {
	  this.toppings = toppings;
	}

	@Override
	public void setSauces(String sauces) {
	  this.sauces = sauces;

	}
	public String getBread() {
		  return bread;
	}

	public String getToppings() {
	  return toppings;
	}

	public String getSauces() {
	  return sauces;
	}

}
