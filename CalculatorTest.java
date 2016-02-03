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

		Calculator[] parentcal = new Calculator[1];
		//	    parentcal[0] = new OctalCalculator();
		//	    parentcal[0].set_currentOperator('+');
		//	    parentcal[1] = new DecimalCalculator();
		//	    parentcal[1].set_currentOperator('-');
		//	    parentcal[2] = new HexaCalculator();
		//	    parentcal[2].set_currentOperator('*');
		parentcal[0] = new BinaryCalculator();
		parentcal[0].set_currentOperator('/');


		for (int i = 0; i < parentcal.length; i++)
		{
			testCalculator (parentcal[i]);
		}	

		do {
			menuChoice = operations.displayMainMenu();
			switch (menuChoice) {
			case 1:
				// Calculate Binary number
				operations.base2();
				break;
			case 2:
				System.out.println("\t\t ** Choice 2 selected **");
				break;
			case 3:
				System.out.println("\t\t ** Choice 3 selected **");
				break;
			case 4:
				System.out.println("\t\t ** Choice 4 selected **");
				break;
			case 0:
				System.out.println("\t\t ** Choice 0 selected **");
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






	public static void testCalculator(Calculator tempcal)
	{

		System.out.println("First Test on " + tempcal.getClass().getName());		
		tempcal.set_firstOperand(63);
		tempcal.set_secondOperand(33);
		System.out.println(tempcal.displayExpression());
		System.out.print("Result: ");
		System.out.println(tempcal.result());

		System.out.println("Second Test" + tempcal.getClass().getName());		
		tempcal.set_firstOperand(103);
		tempcal.set_secondOperand(33);
		System.out.println(tempcal.displayExpression());
		System.out.print("Result: ");
		System.out.println(tempcal.result());

		System.out.println("Third Test" + tempcal.getClass().getName());		
		tempcal.set_firstOperand(100);
		tempcal.set_secondOperand(50);
		System.out.println(tempcal.displayExpression());
		System.out.print("Result: ");
		System.out.println(tempcal.result());

		System.out.println("---------------------------------");

	}

}// End of CalculatorTest Class
