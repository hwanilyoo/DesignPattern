package chapter01;

class Course{
	private String id;
	private String name;
	private int numOfStudents = 0;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	
	public void addStudent(){}
	public void deleteStudent(){}
}
public class CheckPoint_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
