package flyweight.ex2;

import java.util.HashMap;

public class MyCharFactory {
	static final HashMap charcache = new HashMap();
	static int count=0;
	public static MyChar getChar(String c) {
		MyChar ch = (MyChar) charcache.get(c);
		if (ch == null) {
			ch = new MyChar(c);
			charcache.put(c, ch);
			count++;
		}
		return ch;
	}
}
