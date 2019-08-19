package ws7;

import java.text.DecimalFormat;

public class Student {
	private String firstName;
	private String lastName;
	private double grade;
	private String department;
	public String getName() {
		return firstName + " " + lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Student(String firstName, String lastName, double grade, String department) throws StudentException {
		super();
		if (grade > 100 || grade < 0) {
			throw new StudentException("Grade out of bounds, 0-100");
		} else {
			this.firstName = firstName;
			this.lastName = lastName;
			this.grade = grade;
			this.department = department;
		}
	}
	public Student(Student s) {
		super();
			this.firstName = s.firstName;
			this.lastName = s.lastName;
			this.grade = s.grade;
			this.department = s.department;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return firstName + "\t\t" + lastName + "\t\t" + df.format(grade)
				+ "\t\t" + department;
	}
}
