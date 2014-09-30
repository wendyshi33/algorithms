package algorithm.tuding;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMaxSubsection {

	@Test
	public void testMaxSubsection() {
		MaxSubsection maxSection = new MaxSubsection();
		List<Section> list1 = new ArrayList<Section>();
		list1.add(new Section(1, 3, 100));
		list1.add(new Section(2, 4, 200));		
		list1.add(new Section(5, 6, 100));
		int exp1 = 300;
		assertEquals(exp1, maxSection.maxValue(list1));

		List<Section> list2 = new ArrayList<Section>();
		list2.add(new Section(1, 2, 100));
		list2.add(new Section(2, 4, 200));		
		list2.add(new Section(5, 6, 100));
		int exp2 = 300;
		assertEquals(exp2, maxSection.maxValue(list2));

		List<Section> list3 = new ArrayList<Section>();
		list3.add(new Section(1, 5, 100));
		list3.add(new Section(2, 4, 200));		
		list3.add(new Section(5, 6, 300));
		int exp3 = 400;
		assertEquals(exp3, maxSection.maxValue(list3));
	}
	
}
