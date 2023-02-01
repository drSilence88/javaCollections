package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
}

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Ranga", 1), 
				new Student("Edd", 100), 
				new Student("Eve", 2));
		
		ArrayList<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl);
		System.out.println("Desc: " + studentsAl);
		
		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator" + studentsAl);
	}
}
