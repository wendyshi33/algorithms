package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPlusMinusCalculation {

	@Test
  public void testPlusMinusCalculation() {
    PlusMinusCalculation calculation = new PlusMinusCalculation();
		String exp1 = "1+2+3";
    assertEquals(6, calculation.calculate(exp1));
		String exp2 = "1";
	 	assertEquals(1, calculation.calculate(exp2));
		String exp3 = "2-3-5";
		assertEquals(-6, calculation.calculate(exp3));
		String exp4 = "1+2-3+4-5+6";
		assertEquals(5, calculation.calculate(exp4));
		String exp5 = "1-1+1-1+2-2+2-2";
		assertEquals(0, calculation.calculate(exp5));	
  }
}
