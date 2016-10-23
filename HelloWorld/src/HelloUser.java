import java.util.Scanner;

public class HelloUser {
	String userName;
	
	public HelloUser(String userName){
		this.userName = userName;
	}
	
	public void greetUser(){
		System.out.println("Hello " + userName + " how are you? :)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		scanner.close();			
	}
}
