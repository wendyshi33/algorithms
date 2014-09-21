package algorithm.google;

/**
 *	Check whether a number is power of 3.
 *	
 *	O(log_3^N)
 */
public class PowerOfThree {

	public boolean isPowerOfThree(int num) {
		if (num == 0 || num == 3) {
			return true;
		} else if (num == 1 || num == 2) {
			return false;
		} else {
			return num % 3 == 0 && isPowerOfThree(num / 3);
		}
	}
}
