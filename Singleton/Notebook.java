package singleton;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
	private static Notebook nbObject;
	private List<String> notes;
	
	private Notebook() {
		notes = new ArrayList<String>();
	}
	
	public static Notebook getInstance() {
		// create object if it's not already created
	    if(nbObject == null) {
	         nbObject = new Notebook();
	    }

	    // returns the singleton object
       return nbObject;
	}

	public void getConnection() {
       System.out.println("You are now reading the notebook.");
	}
	
	public void addNote(String note) {
		notes.add(note);
	}
	
	public void readNotes() {
		for (String i : notes) {
			System.out.println(i);
		}
	}
}

