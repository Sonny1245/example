package demorepo2;

import java.util.*;
import java.util.stream.*;

public class MapsToListConversion {
    
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<String, String>();
		System.out.print("How many student would you like to enter: ");
		int noOfStudents = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<noOfStudents; i++) {	
			String input = scanner.nextLine();
			String[] listOfStudents = input.split(" ");
			String studentId = listOfStudents[0];
			String studentName = listOfStudents[1];
			map.put(studentId, studentName);		
		}
		
		scanner.close();
		
		//Create empty Lists of Keys and Values:
		List<String> ListOfKeys = null;
		List<String> ListOfValues = null;
		
		//Now convert the HashMap into those lists:
		ListOfKeys = map.keySet().stream().
		collect(Collectors.toCollection(ArrayList::new));
		
		ListOfValues = map.values().stream().
		collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println("Student Id's: ");
		for(String keys: ListOfKeys) {		
			System.out.println(keys);		
		}
		
		System.out.println("\n++++++++++++");
		
		System.out.println("Student Names: ");
		for(String values: ListOfValues) {
			System.out.println(values);
		}
		
	}

}
