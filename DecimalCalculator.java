import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalCalculator extends Calculator {
	Scanner userInput = new Scanner(System.in);

	@Override
	public int add() {
		return this.get_firstOperand() + this.get_secondOperand();
	}

	@Override
	public int subtract() {
		return this.get_firstOperand() - this.get_secondOperand();
	}

	@Override
	public int multiply() {
		return this.get_firstOperand() * this.get_secondOperand();
	}

	/**
	 * Returns the result or -1 if exception thrown
	 */
	@Override
	public int divide() throws ArithmeticException {
		return this.get_firstOperand() / this.get_secondOperand();
	}


	@Override
	public int getInput() {
		int operand;
		try {
			operand = userInput.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You entered an invalid number!");
			operand = -1;
		}
		return operand;
	}

	public char getOperator() {
		char operator;

		System.out.println("Please enter your operator");
		System.out.print("You can enter a + - / *");
		try {
			operator = userInput.next().charAt(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("You entered an invalid operator!");
			operator = 0;
		}
		return operator;
	}

	@Override
	public String displayOperand(int operand)
	{
		return intToDecimalString(operand);
	}


	@Override
	public String result() {
		String result = null;
		switch (get_currentOperator()) {
		case '+':
			result = intToDecimalString(add());
			break;
		case '-':
			result = intToDecimalString(subtract());
			break;
		case '/':
			try {
				result = intToDecimalString(divide());
			} catch (ArithmeticException e) {
				result = "Sorry, but you threw and arithmatic exception!";
			}
			break;
		case '*':
			result = intToDecimalString(multiply());
			break;

		default:
			System.out.println("Something wierd happened! (hint* maybe a default switch case!)");
			break;
		}
		return result;
	}

	public String intToDecimalString(int operand){
		return Integer.toString(operand);
	}

}
