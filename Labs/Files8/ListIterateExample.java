import java.util.*;

public class ListIterateExample {
	public static void main(String a[]){

		List<String> strList = new LinkedList<>();

		strList.add("First");
		strList.add("Second");
		strList.add("Third");

		Iterator<String> it = strList.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().toLowerCase());
		}
		System.out.println(strList);

		//removes all strings with less than or equal to five characters
		strList.removeIf(s -> s.length() <= 5);
		System.out.println(strList);
	}
}

