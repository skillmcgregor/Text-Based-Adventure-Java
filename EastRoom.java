package textbasedadventure;
import java.util.Scanner;
public class EastRoom {
	public int key;
	private int keychoice;
	private int choice;
	public EastRoom() {}
	
	public void initialize() {
		Scanner input = new Scanner(System.in);
		CentralRoom central = new CentralRoom();
		choice = 0;
		System.out.println("You enter a small wooden room. There is a lovely desk with a glass vase in the back of the room.");
		while (choice != 3) {
			System.out.println("1: Look around \n2: Interact \n3: Back to the central room");
			choice = input.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("The room is very quaint. Nothing stands out to you except for the vase on the desk.");
				break;
			}
			case 2: {
				System.out.println("You spy something small and shiny floating in the vase. Try and grab it?");
				System.out.println("1: Yes \n2: No");
				keychoice = input.nextInt();
				switch (keychoice) {
				case 1: {
					System.out.println("You picked up a [small key].");
					break;
				}
				case 2: {
					break;
				}
				default: {
					System.out.println("That is not a valid option.");
					break;
				}
				}
				break;
			}
			case 3: {
				central.initialize();
				break;
			}
			default: {
				System.out.println("That's not a valid option.");
			}
			}
		}
	}
}