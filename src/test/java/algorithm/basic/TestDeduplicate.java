package algorithm.basic;

import java.util.*;
import org.junit.Test;
import org.junit.Assert;
import static junitx.framework.ListAssert.assertEquals;

public class TestDeduplicate {

	@Test
	public void testDeduplicate() {
		Deduplicate.Contact c1 = new Deduplicate.Contact("c1");
    c1.addEmail("shuw@fb.com");
    c1.addEmail("shu@gmail.com");
    Deduplicate.Contact c2 = new Deduplicate.Contact("c2");
    c2.addEmail("bob@fb.com");
    Deduplicate.Contact c3 = new Deduplicate.Contact("c3");
    c3.addEmail("shu@gmail.com");
    c3.addEmail("shuwu@yahoo.com");
    Deduplicate.Contact c4 = new Deduplicate.Contact("c4");
    c4.addEmail("shuwu@yahoo.com");
    Deduplicate.Contact c5 = new Deduplicate.Contact("c5");
    c5.addEmail("bob@fb.com");
    Deduplicate.Contact c6 = new Deduplicate.Contact("c6");
    c6.addEmail("jamie@fb.com");
    List<Deduplicate.Contact> list = new ArrayList<Deduplicate.Contact>();
    list.add(c1);
    list.add(c2);
    list.add(c3);
    list.add(c4);
    list.add(c5);
    list.add(c6);
		Deduplicate deduplicate = new Deduplicate();
    List<List<String>> res = deduplicate.deduplicate(list);
		List<String> list1 = new ArrayList<String>();
		list1.add("c6");
		List<String> list2 = new ArrayList<String>();
		list2.add("c1");
		list2.add("c3");
		list2.add("c4");
		List<String> list3 = new ArrayList<String>();
		list3.add("c2");
		list3.add("c5");
		assertEquals(list2, res.get(0));
		assertEquals(list3, res.get(1));
		assertEquals(list1, res.get(2));	
	}	
}
