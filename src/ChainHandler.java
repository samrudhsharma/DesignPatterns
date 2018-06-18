// Chain of Responsibility
// Class responsible for building the chain
public class ChainHandler {
	public CurrencyChain link1;

	public ChainHandler() {
		// Initialising the chain
		this.link1 = new Denomination100();
		CurrencyChain link2 = new Denomination50();
		CurrencyChain link3 = new Denomination10();

		// Building the chain of responsibility
		link1.nextInChain(link2);
		link2.nextInChain(link3);
	}
}
