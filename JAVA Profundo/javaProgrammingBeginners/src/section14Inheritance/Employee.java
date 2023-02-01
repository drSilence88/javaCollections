package section14Inheritance;

import java.math.BigDecimal;

public class Employee extends Person{
	private String title;
	private String employerName;
	private char employeGrade;
	private BigDecimal salary;
	
	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployeGrade() {
		return employeGrade;
	}
	public void setEmployeGrade(char employeGrade) {
		this.employeGrade = employeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + employeGrade + "#";
	}
}
