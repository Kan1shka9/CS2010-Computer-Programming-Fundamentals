/**
 * Java Enum :-
 * 1.) Define a collection of constants.
 * 2.) Java enum is a special kind of Java class
 * 3.) Enum can contain constants and methods
 * 4.) Values are capitalized because they are constants; each instance of the enum has one of these constant values
 */
package CS2010.Lecture_10;

public class EnumExample {
	
	public enum Monster{ZOMBIE, VAMPIRE, DEMON, WEREWOLF};

	public static void main(String[] args) {
		Monster m = Monster.ZOMBIE; 
		if(m == Monster.ZOMBIE) 
			System.out.println("Zombie approaching!");
		
		// Use as method parameter: 			
		// myMethod(Monster m){}
		// Send as argument:
		// myMethod(Monster.ZOMBIE);
	}
}