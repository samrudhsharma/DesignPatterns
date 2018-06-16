// A composite class implementing all the operations of the component interface. Composite classes have methods to access and modify its children/leaf classes (Intern)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Manager(String name,String dept, int sal) {
	      this.name = name;
	      this.dept = dept;
	      this.salary = sal;
	      subordinates = new ArrayList<Employee>();
	   }
	
	@Override
	public void add(Employee employee) {
		subordinates.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		subordinates.remove(employee);

	}

	@Override
	public List<Employee> getSubordinates() {
		return  subordinates;
	}

	@Override
	public void print() {
		System.out.println("Name: " + name + ", department: " + dept + ", salary: " + salary);
		Iterator<Employee> employeeIterator = subordinates.iterator();
	    while(employeeIterator.hasNext()){
	     Employee employee = employeeIterator.next();
	     employee.print();
	    }
	}
	
	


}
