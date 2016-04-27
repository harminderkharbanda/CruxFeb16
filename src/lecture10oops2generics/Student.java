package lecture10oops2generics;

public class Student implements CompareInterface<Student> {

	public int marks;

	@Override
	public int compareTo(Student input) {
		
		if(this.marks > input.marks)
			return 1;
		else if(this.marks < input.marks)
			return -1;
		else
			return 0;	
	}
	
	
}
