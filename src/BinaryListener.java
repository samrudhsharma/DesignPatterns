// Observer Pattern
// This is one of the listener/ Observer classes for the class Subject. Any changes in Subject causes a change here
public class BinaryListener extends Observer {
	
  public BinaryListener(Subject subject) {
    this.subject = subject;
    this.subject.addListener(this);
  }

  public void updateListener() {
    System.out.print("The number in Binary: " + Integer.toBinaryString(subject.getState())+"\n");
  }
}
