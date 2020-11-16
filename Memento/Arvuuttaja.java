import java.util.Random;
/**
 * 
 * @author oauvi
 *
 */
public class Arvuuttaja {
	
	private Random rand;
	
	public Arvuuttaja() {
		rand = new Random();
		
	}
	
	public Memento liityPeliin() {
		Memento out = new Memento(arvoLuku());
		
		return out;
	}
	
	public int arvoLuku() {
		int max = 10;
		int min = 1;
		
		return rand.nextInt((max - min) + 1) + min;
	}
	
	public void arvaus(Asiakas asiakas, Object object) {
		Memento memento = (Memento) object;
		int arvaus = asiakas.getLuku();
		
		if(memento.getLuku() == arvaus) {
			if (arvaus != 0) {
				System.out.println("Arvuutajan luku oli " + memento.getLuku());
				System.out.println("Oikein");
			}
		} else {
			if (arvaus != 0) {
				System.out.println("Arvuutajan luku oli " + memento.getLuku());
				System.out.println("Väärin");
			}
		}
	}
	
	private class Memento {
		private int luku;
		
		public Memento(int luku) {
			this.luku = luku;
		}
		
		public int getLuku() {
			return this.luku;
		}
		
		public void setLuku(int luku) {
			this.luku = luku;
		}
		
	}
}
