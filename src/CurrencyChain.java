// Chain of Responsibility
// An interface for each object/note denomination to implement
public interface CurrencyChain {
  public void nextInChain(CurrencyChain nextLink);
  public void numberOfNotes(Currency currency);
}
