package iterator.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> aggregate = new ArrayList<String>();
		aggregate.add("Ankur");
		aggregate.add("chandru");
		aggregate.add("arun");
		aggregate.add("pavan");

		int count=0;
		for(int i=0;i<aggregate.size();i++){
			aggregate.get(i).concat("u");
			count++;
		}

		System.out.println(count);

		Iterator<String> itr = aggregate.iterator();

		System.out.println(itr.getClass().getName());

		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);

		}

	}

}
