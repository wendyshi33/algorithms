package algorithm.google;

/**
 *	Check whether a number is power of 3.
 *	
 */
public class PowerOfThree {

	public boolean isPowerOfThree(int num) {
		if (num == 0) {
			return true;
		}
		
		do {
			if (num % 3 != 0) {
				return false;
			}
			int sum = 0;
			int tmp = num;
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;	
			}
			num = sum / 3;
		} while (num != 1); 

		return true;
	}
}
