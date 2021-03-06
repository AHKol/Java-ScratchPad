package ws7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StudentProcess {
	public static void main(String[] args) {
				
		//task one
		List<Student> students = new ArrayList<Student>();
		
        try {
			students.add(new Student("Jack", "Smith", 50.0, "IT"));
	        students.add(new Student("Aaron", "Johnson", 76.0, "IT"));         
	        students.add(new Student("Maaria", "White", 35.8, "Business"));         
	        students.add(new Student("John", "White", 47.0, "Media"));     
	        students.add(new Student("Adam", "Kolodko", 80.0, "Development"));
	        students.add(new Student("Laney", "White", 62.0, "IT"));          
	        students.add(new Student("Jack", "Jones", 32.9, "Business"));         
	        students.add(new Student("Wesley", "Jones", 42.89, "Media"));
		} catch (StudentException e) {}
        
        System.out.println("Task 1: \n \nComplete Student list");
        students.forEach(System.out::println);
        System.out.println(); //newline
        
        //Task Two =======================================

        
        List<Student> filtered = students.stream()
                .filter(w -> w.getGrade() >= 50)
                .collect(Collectors.toList());
        filtered.sort(Comparator.comparing(Student::getGrade));
        
        System.out.println("Task 2: \n \nStudents who got 50.0-100.0 sorted by grade");
        filtered.forEach(System.out::println);
        System.out.println();//newline
        
        //task three ========================================================================
        System.out.println("Task 3: \n \nFirst Student who got 50.0-100.0");
        System.out.println(Collections.min(filtered, Comparator.comparing(Student::getGrade)));
        System.out.println();//newline
        
        //task four =============================================================
        students.sort(Comparator.comparing(Student::getFirstName));
        students.sort(Comparator.comparing(Student::getLastName));
        
        System.out.println("Task 4: \n \nStudents in ascending order by last name then first");
        students.forEach(System.out::println);
        System.out.println();//newline
        
        students.sort(Comparator.comparing(Student::getFirstName));
        students.sort(Comparator.comparing(Student::getLastName));
        Collections.reverse(students);
        
        System.out.println("Students in decending order by last name then first");
        students.forEach(System.out::println);
        System.out.println();//newline
        
        //task five ==============================================================
        HashSet<String> lastNames = new HashSet<String>();
        students.sort(Comparator.comparing(Student::getLastName));
        students.forEach(s -> lastNames.add(s.getLastName()));
        
        System.out.println("Task 5: \n \nUnique Student last names");
        lastNames.forEach(System.out::println);
        System.out.println();//newline    
        
        //task six ==============================================================
        students.sort(Comparator.comparing(Student::getFirstName));
        students.sort(Comparator.comparing(Student::getLastName));
        
        System.out.println("Task 6: \n \nStudent name in order by last name then first name");
        students.forEach(s -> { System.out.println(s.getFirstName() + " " + s.getLastName()); } );
        System.out.println();//newline
        
        //task seven ============================================================== 
        Map<String,List<Student>> departments = students.stream().collect(Collectors.groupingBy(Student::getDepartment));               
        
        System.out.println("Task 7: \n \nStudents by department");
        departments.forEach((k, s) -> { System.out.println(k + ":"); 
        								s.forEach(System.out::println); 
        								} );
        System.out.println();//newline
        
        //task eight ==============================================================
        System.out.println("Task 8: \n \nCount of Students by department");
        departments.forEach((k, s) -> { System.out.println(k + " has " 
        								+ s.stream().count() 
						        		+ " student(s)" ); 
        								} );
        System.out.println();//newline
        
        //task nine ==============================================================
        double sum = students.stream().collect(Collectors.summingDouble(Student::getGrade));
        
        System.out.println("Task 9: \n \nSum of Students' grades: " + sum + "\n");
        
        //task ten ==============================================================
        double avg = students.stream().collect(Collectors.averagingDouble(Student::getGrade));
        
        
        System.out.println("Task 10: \n \nAverage of Students' grades: " + avg + "\n");

	}
}
