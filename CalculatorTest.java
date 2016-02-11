import java.util.Scanner;


// This is a test
// This another test
//Test 3
public class CalculatorTest {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] sargs) {
		Operations operations = new Operations();
		
		int menuChoice = -1;
		boolean doMore = true;

		System.out.println("\t\t\tThe Calculamator 5000 Pro\n");    
		do {
			menuChoice = operations.displayMainMenu();
			switch (menuChoice) {
			case 1:
				// Calculate Binary number
				operations.base2();
				break;
			case 2:
				operations.base8();
				break;
			case 3:
				operations.base10();
				break;
			case 4:
				operations.base16();
				break;
			case 0:
				System.out.println("\t\t ** Exiting The Calcumalator 5000 Pro! **");
				doMore = false;
				break;

			default:
				System.out.println("\t\t\tWell that was akward!");
				operations.pressEnterToContinue();
				operations.clearScreen();
				break;
			}
			operations.pressEnterToContinue();
		} while (doMore);


		System.out.println("\n\n\nThank you for using The Calcumalator 5000 Pro!\n");
		System.out.println("\nHave a nice day!");
	}// End of Main Method


}// End of CalculatorTest Class
