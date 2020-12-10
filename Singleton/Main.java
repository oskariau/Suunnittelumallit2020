package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook nb = Notebook.getInstance();

		nb.getConnection();
		nb.addNote("Eka viesti");
		nb.addNote("Toka viesti");
		nb.readNotes();
		
		Notebook nb2 = Notebook.getInstance();
		nb2.getConnection();
		nb2.readNotes();
		nb2.addNote("Salaisuus");
		
		nb.getConnection();
		nb.readNotes();
	}

}
