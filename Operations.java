
public class Operations {
	
	public void base2() {
		System.out.println("\t\t ** Choice binary selected **");
		// Make the calulator object
		Calculator binaryCalculator = new BinaryCalculator();
	    System.out.println("First Test on the " + binaryCalculator.getClass().getName() + " class.\n\n");		
		// Get first number
	    System.out.print("Enter first number: ");
	    binaryCalculator.set_firstOperand(binaryCalculator.getInput());
	    // get second number
		System.out.print("\nEnter second number: ");
	    binaryCalculator.set_secondOperand(binaryCalculator.getInput());
	    // Set the operator
	    binaryCalculator.set_currentOperator(displayOperatorMenu());
		// Display their expression
	    System.out.println(binaryCalculator.displayExpression());
	    // Display the result
	    System.out.print("Result: ");
	    System.out.println(binaryCalculator.result());
	}
	
	public void base8() {
		System.out.println("\t\t ** Choice octal selected **");
		// Make the calulator object
		Calculator octalCalculator = new OctalCalculator();
	    System.out.println("First Test on the " + octalCalculator.getClass().getName() + " class.\n\n");		
		// Get first number
	    System.out.print("Enter first number: ");
	    octalCalculator.set_firstOperand(octalCalculator.getInput());
	    // get second number
		System.out.print("\nEnter second number: ");
	    octalCalculator.set_secondOperand(octalCalculator.getInput());
	    // Set the operator
	    octalCalculator.set_currentOperator(displayOperatorMenu());
		// Display their expression
	    System.out.println(octalCalculator.displayExpression());
	    // Display the result
	    System.out.print("Result: ");
	    System.out.println(octalCalculator.result());
	}
	
	public void base10() {
		System.out.println("\t\t ** Choice hexa selected **");
		// Make the calulator object
		Calculator hexaCalculator = new HexaCalculator();
	    System.out.println("First Test on the " + hexaCalculator.getClass().getName() + " class.\n\n");		
		// Get first number
	    System.out.print("Enter first number: ");
	    hexaCalculator.set_firstOperand(hexaCalculator.getInput());
	    // get second number
		System.out.print("\nEnter second number: ");
	    hexaCalculator.set_secondOperand(hexaCalculator.getInput());
	    // Set the operator
	    hexaCalculator.set_currentOperator(displayOperatorMenu());
		// Display their expression
	    System.out.println(hexaCalculator.displayExpression());
	    // Display the result
	    System.out.print("Result: ");
	    System.out.println(hexaCalculator.result());
	}
	
	public void base16() {
		System.out.println("\t\t ** Choice decimal selected **");
		// Make the calulator object
		Calculator decimalCalculator = new DecimalCalculator();
	    System.out.println("First Test on the " + decimalCalculator.getClass().getName() + " class.\n\n");		
		// Get first number
	    System.out.print("Enter first number: ");
	    decimalCalculator.set_firstOperand(decimalCalculator.getInput());
	    // get second number
		System.out.print("\nEnter second number: ");
	    decimalCalculator.set_secondOperand(decimalCalculator.getInput());
	    // Set the operator
	    decimalCalculator.set_currentOperator(displayOperatorMenu());
		// Display their expression
	    System.out.println(decimalCalculator.displayExpression());
	    // Display the result
	    System.out.print("Result: ");
	    System.out.println(decimalCalculator.result());
	}

	/**
	 * Displays a menu to the user and returns a menu choice integer
	 * or returns -1 if invalid menuchoice
	 * @return integer
	 */
	public int displayMainMenu() {
		int menuChoice = -1;
		boolean baseIsGood = false;
		while (!baseIsGood) {
			clearScreen();
			System.out.println("\t\t\tSelect a BASE: 2, 8, 10, 16\n");
			System.out.println("(1) to work with Base 2");
			System.out.println("(2) to work with Base 8");
			System.out.println("(3) to work with Base 10");
			System.out.println("(4) to work with Base 16");
			System.out.println("(0) to exit\n");
	
			System.out.print("Menu choice: ");
	
			try {
				menuChoice = Integer.parseInt(CalculatorTest.userInput.nextLine());
				if (menuChoice >= 0 && menuChoice <= 4){
					baseIsGood = true;
				}
				else {
					System.out.println("\t\tPlease enter a valid menu choice!");
					System.out.println("\t\tAn integer between '0' and '4'");
					pressEnterToContinue();
					clearScreen();
				}
			} catch (Exception e) {
				System.out.println("\n\t\t ERROR: Please enter an actual integer!");
				System.out.println("\tHINT: Must be between -2,147,483,648 and 2,147,483,647\n\n\n");
				pressEnterToContinue();
			}
	
		}// End of whilebBaseIsGood
		System.out.println("\n\n");
		return menuChoice;
	}

	public char displayOperatorMenu() {
		char menuChoice = 0;
		boolean choiceIsGood = false;
		while (!choiceIsGood) {
			int counter = 0;
			System.out.println("\n\t\t\tSelect an operation: '+', '-', '*', '/' or select a number.\n");
			System.out.println("(1) for addition.");
			System.out.println("(2) for subtraction");
			System.out.println("(3) for Multiplication");
			System.out.println("(4) division");
			System.out.print("Menu choice: ");
	
			try {
				menuChoice = CalculatorTest.userInput.nextLine().charAt(0);
				if (menuChoice == '+' ||
						menuChoice == '-' ||
						menuChoice == '/' || 
						menuChoice == '*' ||
						menuChoice == '1' ||
						menuChoice == '2' ||
						menuChoice == '3' ||
						menuChoice == '4')
				{
					choiceIsGood = true;
				}
				else {
					System.out.println("\t\tPlease enter a valid menu choice!");
					System.out.println("\t\tAn integer between '1' and '4'");
					pressEnterToContinue();
					clearScreen();
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("\n\t\t ERROR: Please enter an actual integer!");
				System.out.println("\tHINT: Must be between -2,147,483,648 and 2,147,483,647\n\n\n");
				pressEnterToContinue();
			}
			counter++;
		}// End of whilebBaseIsGood
		if (menuChoice == '1'){
			menuChoice = '+';
		}
		else if (menuChoice == '2') {
			menuChoice = '-';
		}
		else if (menuChoice == '3') {
			menuChoice = '*';
		}
		else if (menuChoice == '4') {
			menuChoice = '/';
		}
	
		System.out.println("\n\n");
		return menuChoice;
	}

	public void pressEnterToContinue() {
		System.out.print("\nPress the 'Enter' key to continue...");
		try{System.in.read();}
		catch(Exception e){}
	}

	public void clearScreen() {
		int lines = 25;
		for (int i = 0; i < lines; i++) {
			System.out.println("\n");
		}
	
	}
	
}// End of Operations class
