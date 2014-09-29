package algorithm.linkedin;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestNestedIntWeightedSum {

	@Test
	public void testNestedIntWeightedSum() {
		NestedIntWeightedSum sum = new NestedIntWeightedSum();

		// (1, (2, (3, 4), 5), 6)
		ListElement root = new ListElement();				
		root.add(new Int(1));
		ListElement second = new ListElement();
		second.add(new Int(2));
		ListElement third = new ListElement();
		third.add(new Int(3));
		third.add(new Int(4));
		second.add(third);
		second.add(new Int(5));
		root.add(second);
		root.add(new Int(6));

		int exp = 42;

		assertEquals(exp, sum.nestedIntWeightedSum(root));
	}

}
