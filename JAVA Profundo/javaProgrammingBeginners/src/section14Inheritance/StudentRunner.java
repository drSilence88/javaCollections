package section14Inheritance;

public class StudentRunner {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("Ranga");
//		student.setEmail("ranga@gmail.com");
//		
//		Person person = new Person();
//		person.setName("Randa");
//		person.setEmail("ranga@gmail.com");
//		person.setPhoneNumber("123-456-7890");
//		String value = person.toString();
//		System.out.println(person);
//		System.out.println(value);
		
		Employee employee = new Employee("Ranga", "Programer An4lyst");
//		employee.setName("Ranga");
		employee.setEmail("ranga@gmail.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);
	}
}