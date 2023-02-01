package section14Inheritance;

public class Student extends Person {
	private String collegeName;
	private int year;
	
	public Student(String name, String collegeName) {
		super(name);
		System.out.println("Student Constructor");
		this.collegeName = collegeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
