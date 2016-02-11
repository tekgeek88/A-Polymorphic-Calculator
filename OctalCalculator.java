import java.util.InputMismatchException;
import java.util.Scanner;

public class OctalCalculator extends Calculator {

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
		return intToOctalString(operand);
	}


	@Override
	public String result() {
		String result = null;
		switch (get_currentOperator()) {
		case '+':
			result = intToOctalString(add());
			break;
		case '-':
			result = intToOctalString(subtract());
			break;
		case '/':
			result = intToOctalString(divide());
			break;
		case '*':
			result = intToOctalString(multiply());
			break;

		default:
			System.out.println("Something wierd happened! (hint* maybe a default switch case!)");
			break;
		}
		return result;
	}

	public String intToOctalString(int operand){
		String formattedString = "0";
		int num = operand;

		// For storing remainder
		int rem;

		// For storing result
		String str=""; 

		// Digits in Octal number system
		char dig[]={'0','1','2','3','4','5','6','7'};


		while(num>0)
		{
			rem=num%8; 
			str=dig[rem]+str; 
			num=num/8;
		}


		


		String leadingZeroForamtted = String.format("%16s", (formattedString)).replace(' ', '0');

		return str;

	}

}
