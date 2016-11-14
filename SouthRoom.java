package textbasedadventure;
import java.util.Scanner;
public class SouthRoom {
	private int choice;
	public SouthRoom() {}
	
	public void initialize() {
		Scanner input = new Scanner(System.in);
		CentralRoom central = new CentralRoom();
		choice = 0;
		System.out.println("It's pitch black in this room. You can't see anything.");
		while (choice != 3) {
			System.out.println("1: Look around \n2: Interact \n3: Back to the central room");
			choice = input.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("A whole lotta dark.");
				break;
			}
			case 2: {
				System.out.println("You trip on a pipe or something and fall. You decide not to explore yet.");
				break;
			}
			case 3: {
				central.initialize();
				break;
			}
			}
		}
	}
}
