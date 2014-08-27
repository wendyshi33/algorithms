package algorithm.basic;

import java.util.*;

public class BurrowsWheelerTransform {

	public String bwt(String str, String eof) {
		str = str + eof;
		List<String> strList = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); ++i) {
			sb.append(str.substring(i));
			sb.append(str.substring(0, i));
			strList.add(sb.toString());
			sb.setLength(0);
		}

		Collections.sort(strList);

		for (String s : strList) {
			sb.append(s.charAt(s.length() - 1));
		}
		return sb.toString();
	}

}
