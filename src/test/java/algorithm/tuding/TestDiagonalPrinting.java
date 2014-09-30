package algorithm.tuding;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDiagonalPrinting {

	@Test	
	public void testDiagonalPrinting() {
	  DiagonalPrinting print = new DiagonalPrinting();
		char[][] mat1 = {
			"abcd".toCharArray(),
			"efgh".toCharArray(),
			"ijkl".toCharArray(),
			"mnop".toCharArray()
		};
		List<List<Character>> exp1 = new ArrayList<List<Character>>();
		exp1.add(new ArrayList<Character>(Arrays.asList(new Character[] {'a', 'f', 'k', 'p'})));
		exp1.add(new ArrayList<Character>(Arrays.asList(new Character[] {'b', 'g', 'l'})));
		exp1.add(new ArrayList<Character>(Arrays.asList(new Character[] {'c', 'h'})));
		exp1.add(new ArrayList<Character>(Arrays.asList(new Character[] {'d'})));
		exp1.add(new ArrayList<Character>(Arrays.asList(new Character[] {'e', 'j', 'o'})));
		exp1.add(new ArrayList<Character>(Arrays.asList(new Character[] {'i', 'n'})));
		exp1.add(new ArrayList<Character>(Arrays.asList(new Character[] {'m'})));
		assertEquals(exp1, print.diagonalPrinting(mat1));

		char[][] mat2 = {
			"abcd".toCharArray(),
			"efgh".toCharArray()
		};
		List<List<Character>> exp2 = new ArrayList<List<Character>>();
		exp2.add(new ArrayList<Character>(Arrays.asList(new Character[] {'a', 'f'})));
		exp2.add(new ArrayList<Character>(Arrays.asList(new Character[] {'b', 'g'})));
		exp2.add(new ArrayList<Character>(Arrays.asList(new Character[] {'c', 'h'})));
		exp2.add(new ArrayList<Character>(Arrays.asList(new Character[] {'d'})));
		exp2.add(new ArrayList<Character>(Arrays.asList(new Character[] {'e'})));

		assertEquals(exp2, print.diagonalPrinting(mat2));
	}

}
