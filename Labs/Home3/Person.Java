/** Person
 * Practice2
 * Adam Kolodko 
 * 10/25/2017
 * */

abstract class Person{
	String name, last_name, email;
	public abstract void doing() {};
}

interface Talkable{
	public void say();
}
class Student extends Person{
	String program;
	public void doing() {
		System.out.println("Studying as a student");
	}
	public void say() {
		System.out.println("Hello, my same is " + 
				name + " " + last_name + 
				". I'm in the " + program + " program");
	}
}
class Professor extends Person{
	String office;
	public void doing() {
		System.out.println("Teaching as a prof");
	}
	public void say() {
		System.out.println("Hello, my same is" 
				+ name + last_name + ". My office is " + office);
	}
}
class Staff extends Person {
	String title
	public void doing() {
		System.out.println("Working as staff");
	}
	public void say() {
		System.out.println("Hello, my same is" + name + last_name + 
				". I am a " + title);
	}
}
class Meeting{
	Person[] working = new Person[6];
	Meeting() {
		toString()
	}
}