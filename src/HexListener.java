// Observer Patter
// This is one of the listener/ Observer classes for the class Subject. Any changes in Subject causes a change here
public class HexListener extends Observer {

  public HexListener(Subject subject) {
	this.subject = subject;
	this.subject.addListener(this);
  }

  public void updateListener() {
	System.out.print("The number in Hex: " + Integer.toBinaryString(subject.getState())+"\n");
  }
}
