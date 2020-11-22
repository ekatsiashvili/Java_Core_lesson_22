package Task_01;

public class Application {

	public static void main(String[] args) {
		
	Pet cat = () -> "Meow meow-";
	Pet cow = () -> "Moo moo -";
	Pet dog = () -> "Woof woof-";
	
	voice(cat.voice(), "Cat");
	voice(cow.voice(), "Cow");
	voice(dog.voice(), "Dog");
	
	}
	
	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name);
	} 
}