// Chain of Responsibility
// Class to handle denomination of 10
public class Denomination10 implements CurrencyChain {
  private CurrencyChain link; 

  @Override
  public void nextInChain(CurrencyChain nextLink) {
    this.link = nextLink;
  }

  @Override
  public void numberOfNotes(Currency currency) {
    if(currency.returnAmount() >= 10){
	int num = currency.returnAmount()/10;
	int remainder = currency.returnAmount() % 10;
    System.out.println("Number of 10 notes: "+num);
	if(remainder !=0) 
	  link.numberOfNotes(new Currency(remainder));
	}else{
	   link.numberOfNotes(currency);
    }
  }
}
