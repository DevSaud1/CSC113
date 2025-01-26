package lab10;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String newEmail;
		
		Contact c1 = new Contact("Saud","055001","saud@gmail.com","Riyadh");
		Contact c2 = new Contact("sarah","055002","sarah@gmail.com","Jeddah");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("Enter new email address for " + c1.getName() + ":");
		newEmail = scanner.next();
		c1.setEmail(newEmail);
		
		System.out.println(c1.toString());
		
		System.out.println("Number of created objects: " + Contact.count);
		
	}

}
