package Task_02;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		
		List<String> books = new ArrayList<>();
		books.add("First book");
		books.add("Second book");
		books.add("Third book");
		books.add("Forth book");
		books.add("Fifth book");
		
		books.forEach(System.out::println);
			
	}
}