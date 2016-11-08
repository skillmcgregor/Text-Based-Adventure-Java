package textbasedadventure;
import java.util.Scanner;
public class SouthRoom {
Scanner input = new Scanner(System.in);
CentralRoom central = new CentralRoom();
	public SouthRoom() {}
	
	public void initialize() {
		System.out.println("It's pitch black in this room. You can't see anything.");
		System.out.println("1: Look around \n2: Interact \n3: Leave");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("A whole lotta dark.");
			break;
		case 2:
			System.out.println("You trip on a pipe or something and fall. You decide not to explore yet.");
			break;
		case 3:
			central.initialize();
			break;
		}
	}
}
