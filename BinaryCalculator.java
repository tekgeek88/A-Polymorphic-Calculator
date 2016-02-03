import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryCalculator extends Calculator {

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
		return intToBinaryString(operand);
	}


	@Override
	public String result() {
		String result = null;
		switch (get_currentOperator()) {
		case '+':
			result = intToBinaryString(add());
			break;
		case '-':
			result = intToBinaryString(subtract());
			break;
		case '/':
			result = intToBinaryString(divide());
			break;
		case '*':
			result = intToBinaryString(multiply());
			break;

		default:
			System.out.println("Something wierd happened! (hint* maybe a default switch case!)");
			break;
		}
		return result;
	}

	public String intToBinaryString(int operand){

		String formattedString = "0";
		int num = operand;
		int binary[] = new int[40];
		int index = 0;
		while(num > 0){
			binary[index++] = num%2;
			num = num/2;
		}
		for(int i = index-1;i >= 0;i--){
			formattedString = formattedString + binary[i];
		}
		String leadingZeroForamtted = String.format("%16s", (formattedString)).replace(' ', '0');

		return leadingZeroForamtted;

	}

}
