/**
 * Name:			Justin Colyar
 * Class ID:		CSE 360-70641
 * Assignment:		2
 * Description:		The adding machine is a base class that is incomplete,
 * 					but presents an outline of the constructor and various
 * 					public methods. 
 */

package cse360assign2;

/**
 * The class AddingMachine currently has little functionality but provides
 * the outline for the constructor as well as the getTotal, add, sub, toString,
 * and clear functions.
 * 
 * @author Justin Colyar
 *
 */
public class AddingMachine {

	private int total;
	
	/**
	 *  AddingMachine is the sole and default constructor for
	 *  the AddingMachine class. It sets the total equal to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * the getTotal() function returns 0.
	 * 
	 * @return 0
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * The add function takes an integer parameter but
	 * currently is not functional.
	 * 
	 * @param value
	 */
	public void add (int value) {
		
	}
	
	/**
	 * The subtract function takes an integer parameter
	 * and is currently empty. 
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * The toString() method returns the string ""
	 * 
	 * 	@return ""
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * The clear() function is unimplemented and 
	 * has no functionality. 
	 */
	public void clear() {
	
	}
}
