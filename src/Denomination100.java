// Chain of Responsibility
// Class to handle denomination of 100
public class Denomination100 implements CurrencyChain {
  private CurrencyChain link; 

  @Override
  public void nextInChain(CurrencyChain nextLink) {
	  this.link = nextLink;
  }

  @Override
  public void numberOfNotes(Currency currency) {
	if(currency.returnAmount() >= 100){
	  int num = currency.returnAmount()/100;
	  int remainder = currency.returnAmount() % 100;
	  System.out.println("Number of 100 notes: "+num);
	  if(remainder !=0) 
		link.numberOfNotes(new Currency(remainder));
	  }else{
		link.numberOfNotes(currency);
	  }
  }

}
