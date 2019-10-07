/**
 * Name:			Justin Colyar
 * Class ID:		CSE 360-70641
 * Assignment:		2
 * Description:		The AddingMachine.java file contains the class for
 * 					AddingMachine and all of its function definitions that
 * 					allow the user to track a running total that they 
 * 					may retrieve, add to, subtract from, or clear and also
 * 					print the transaction history.
 */

package cse360assign2;

/**
 * The class AddingMachine keeps track of a running total alongside
 * a history of the transaction that lead to the total. The class allows
 * the user to add or subtract a specified amount to the total, print out
 * the transaction history, retrieve the total, or clear the transaction
 * history and total. The default total is 0 when instantiated and "0" for
 * the transaction history.
 * 
 * @author Justin Colyar
 *
 */
public class AddingMachine {

	private int total;
	private String transactionHistory;
	
	/**
	 *  AddingMachine is the sole and default constructor for
	 *  the AddingMachine class. It sets the total equal to 0
	 *  whie also setting the String transactionHistory equal to
	 *  "0"
	 */
	public AddingMachine () {
		transactionHistory = "0";
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * the getTotal() function returns the current total
	 * stored in the 'total' integer.
	 * 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The add function takes an integer parameter value and adds
	 * it to the running total integer. It also updates the string
	 * transactionHistory to include " + " followed by the amount
	 * added to the total. 
	 * 
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		
		// updates transactionHistory to include " + [value]"
		transactionHistory = transactionHistory + " + " + value;
	}
	
	/**
	 * The subtract function takes an integer parameter
	 * value and adds it to the running total integer and also
	 * updates the transactionHistory with " - " followed by the
	 * amount subtracted.
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		
		// updates transactionHistory to include " - [value]"
		transactionHistory = transactionHistory + " - " + value;
	}
	
	/**
	 * The toString() method returns the string transactionHistory, which
	 * actively contains the total summary of transactions in the format
	 * "0", followed by the add or subtract symbol, and the amount (i.e.
	 * "0 + 5 - 2").
	 * 
	 * 	@return transactionHistory
	 */
	public String toString () {
		return transactionHistory;
	}
	
	/**
	 * The clear() function resets the running total to 0
	 * and also resets the transactionHistory string to "0"
	 */
	public void clear() {
		total = 0;
		transactionHistory = "0";
	}
}
