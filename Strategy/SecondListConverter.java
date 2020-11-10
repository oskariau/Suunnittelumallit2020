package main;

import java.util.List;

public class SecondListConverter implements ListConverter {

	@Override
	public String ListToString(List<String> list) {
		String[] array = new String[list.size()];
		list.toArray(array);
		String temp = "";
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				temp = temp + "\n" + list.get(i); 
			} else {
				temp = temp + " " + list.get(i); 
			}
		}
		return temp;
	}

}
