import java.util.Date;
import java.io.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
	return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
	if(students[i]==null)
		throw new  IllegalArgumentException();
		}
	
		this.students = students;
			
	}  

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index>=this.students.length || index<0)
			throw new IllegalArgumentException();
		else
			return this.students[index];  
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length || student ==null)
			throw new IllegalArgumentException();
		else 
			this.students[index] = student;
	
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent == 0) {
		throw new IllegalArgumentException();
		}
		else {
		int y = this.students[indexOfStudent].getBirthDate().getYear();
		return 2017-y;

		}

	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Student[] s =this.students;
		int j=0;
		for(int i=0;i<this.students.length;i++) {
			if(age==this.getCurrentAgeByDate(i)) {
				s[j]=this.students[i];
				j++;
			}
		}
		Student[] s2 = new Student[j+1];
		s2=s;
		return s1;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		Student[] s =this.students;
		int count = Integer.MIN_VALUE;
		int j=0;
		for(int i=0;i<this.students.length;i++) {
			if(count<this.students[i].getAvgMark()) {
				s[j]=students[i];
				j++;
			}
	}
Student[] s1 = new Student[j+1];
s1=s;
return s1;
}

	@Override
	public Student getNextStudent(Student student) {
		if(student == null) {
	throw new IllegalArgumentException();
	}
	else {
		for(int i=0;i<this.students.length;i++) {
			if(this.students[i]==student) {
				return this.students[i+1];
		}
		}
	}
	return null;
}
}
