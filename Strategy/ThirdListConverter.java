package main;

import java.util.List;

public class ThirdListConverter implements ListConverter {

	@Override
	public String ListToString(List<String> list) {
		String temp = "";
		for (int i = 0; i < list.size(); i++) {
			if (i % 3 == 0) {
				temp = temp + "\n" + list.get(i); 
			} else {
				temp = temp + " " + list.get(i); 
			}
		}
		return temp;
	}

}
