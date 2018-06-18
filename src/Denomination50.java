// Chain of Responsibility
// Class to handle denomination of 50
public class Denomination50 implements CurrencyChain {
  private CurrencyChain link; 

  @Override
  public void nextInChain(CurrencyChain nextLink) {
    this.link = nextLink;
  }

  @Override
  public void numberOfNotes(Currency currency) {
    if(currency.returnAmount() >= 50){
	  int num = currency.returnAmount()/50;
	  int remainder = currency.returnAmount() % 50;
	  System.out.println("Number of 50 notes: "+num);
	  if(remainder !=0) 
		 link.numberOfNotes(new Currency(remainder));
	 }else{
		link.numberOfNotes(currency);
	 }
  }
}
