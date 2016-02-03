
public interface InOut {
   
	public String displayOperand(int operand);
    
	/**
	 * Gets an integer from the user<p>
	 * Returns -1 on an inputmismatchexception
	 * @return an integer
	 */
    public int getInput();
    
    /**
	 * Gets an operator from the user<p>
	 * Returns -1 on an inputmismatchexception
	 * @return an integer
	 */
    public char getOperator();
    
    
}
