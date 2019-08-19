/** Student
 * Practice2
 * Adam Kolodko 
 * 10/19/2017
 * */

public class Student{
	private String name;
	private int id;
	private float gpa;
	
	Student(String new_name, int new_id, float new_gpa){
		name = new_name;
		id = new_id;
		gpa = new_gpa;
	}
	private String get_name() { return name; }
	private int get_id() { return id; }
	private float get_gpa() { return gpa; }
	private void set_gpa(float new_gpa) { gpa = new_gpa; }
	private void printStudent() { System.out.println(name + id + gpa); }
	
	public static void main(String[] arg) {
		Student foo = new Student("Adam", 123, 3.1f); 
		foo.printStudent();
		foo.set_gpa(3.5f);
		System.out.println(foo.get_name() + foo.get_id() + foo.get_gpa());
	}
}