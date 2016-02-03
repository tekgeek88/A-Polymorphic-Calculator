
public abstract class Calculator implements Operator, InOut {

	public Calculator() {
		this(0,0);
	}
	
	public Calculator(int newFirst, int newSecond) {
		_firstOperand = newFirst;
		_secondOperand = newSecond;
		_currentOperator = '+';
	}
	
	public Calculator(int newFirst, int newSecond, char newOperator) {
		_firstOperand = newFirst;
		_secondOperand = newSecond;
		_currentOperator = newOperator;
	}

	private int _firstOperand;
	private int _secondOperand;
	private char _currentOperator;
	
	
    public int get_firstOperand() {
		return _firstOperand;
	}

	public void set_firstOperand(int _firstOperand) {
		this._firstOperand = _firstOperand;
	}

	public int get_secondOperand() {
		return _secondOperand;
	}

	public void set_secondOperand(int _secondOperand) {
		this._secondOperand = _secondOperand;
	}

	public char get_currentOperator() {
		return _currentOperator;
	}

	public void set_currentOperator(char _currentOperator) {
		this._currentOperator = _currentOperator;
	}

	public String toString()
    {
    	return new String ("Base Class Calculator with first operand is " + _firstOperand + " and second operand is " +_secondOperand + " and operator is " + get_currentOperator());
    }
	
	public String displayOperand(int operand)
	{
		return "To be implemented in subclass";
	}
    
    public String displayExpression() {
    	return new String (displayOperand(_firstOperand) + " " + get_currentOperator() + " " + displayOperand(_secondOperand));
    }

    public abstract String result();   // This function will perform the operation on _firstOperanderand, _secondOperanderand, and _currentOperator
    
}

