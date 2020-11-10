package main;

import java.util.List;
import java.util.ListIterator;

public class FirstListConverter implements ListConverter {

	@Override
	public String ListToString(List<String> list) {
		String temp = "";
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			temp = listIterator.next() + "\n";
		}
		
		return temp;
	}

}
