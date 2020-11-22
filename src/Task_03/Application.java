package Task_03;

public class Application {

	public static void main(String[] args) {

		Printable eat = () -> System.out.println("I'm eating");
		Printable sleep = () -> System.out.println("I'm sleeping");
		Printable swim = () -> System.out.println("I'm swimming");
		Printable walk = () -> System.out.println("I'm walking");

		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}
}