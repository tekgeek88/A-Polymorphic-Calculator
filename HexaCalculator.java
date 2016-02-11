import java.util.InputMismatchException;
import java.util.Scanner;

public class HexaCalculator extends Calculator {

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
		return intToHexaString(operand);
	}


	@Override
	public String result() {
		String result = null;
		switch (get_currentOperator()) {
		case '+':
			result = intToHexaString(add());
			break;
		case '-':
			result = intToHexaString(subtract());
			break;
		case '/':
			result = intToHexaString(divide());
			break;
		case '*':
			result = intToHexaString(multiply());
			break;

		default:
			System.out.println("Something wierd happened! (hint* maybe a default switch case!)");
			break;
		}
		return result;
	}

	public String intToHexaString(int operand){
		int num = operand;
		// For storing remainder
	     int rem;
	        
	     // For storing result
	     String str2=""; 
	 
	     // Digits in hexadecimal number system
	     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	 
	     while(num>0)
	     {
	       rem=num%16; 
	       str2=hex[rem]+str2; 
	       num=num/16;
	     }
	     return str2;
	}
}
