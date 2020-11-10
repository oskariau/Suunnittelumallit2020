package main;

import java.util.List;

public class ListPrinter {

	private List<String> list;
	private ListConverter listconverter;
 	
	public ListPrinter(ListConverter listconverter, List<String> list) {
		this.listconverter = listconverter;
		this.list = list;
	}
	
	public void printList() {
		System.out.print(listconverter.ListToString(list));
	}
	
	public void setListConverter(ListConverter listconverter) {
		this.listconverter = listconverter;
	}
}
