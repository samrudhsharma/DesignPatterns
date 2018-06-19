// Observer Patter
// This is one of the listener/ Observer classes for the class Subject. Any changes in Subject causes a change here
public class OctListener extends Observer {

  public OctListener(Subject subject) {
    this.subject = subject;
    this.subject.addListener(this);
  }

  public void updateListener() {
	System.out.print("The number in Oct: " + Integer.toBinaryString(subject.getState())+"\n");
  }
}
