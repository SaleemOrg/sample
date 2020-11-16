package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LLIST {

	public static void main(String[] arg) {
		
		List<Employee> empList = Arrays.asList(new Employee(2,"Saleem"), new Employee(1,"Saleem"));
		Set<Employee> set = new LinkedHashSet<Employee>();
		
		List<Employee> l2 = List.of(new Employee(2,"Saleem"));
		l2.forEach(System.out::println);
		
		List<Employee> uniquelist = new ArrayList<Employee>(new LinkedHashSet<Employee>(empList));
		//System.out.println(uniquelist);
		//Comparator.comparing(Employee::getName);
		
		//set.addAll(empList);
		
//		for(Employee emp : empList) {
//			set.add(emp);
//			
//		}
		
		//System.out.println(set);
		
		//String s = "Saleem";
		//s-> System.out.println(s);
		//uniquelist.forEach(System.out::println);
	}
}

class Employee{
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + "]";
	}

	int rollno;
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	
	Employee(int roll, String nm) {
		rollno = roll;
		name = nm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		//result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
//		if (rollno != other.rollno)
//			return false;
		return true;
	}
	
	
}
