import java.util.Scanner;
/**
 * 
 * @author oauvi
 *
 */
public class Asiakas {

		Scanner lukija = new Scanner(System.in);;
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Object object;
		int luku;
		
		public Asiakas() {
			luku = 1;
		}
		
		public void pelaa() {
			System.out.println("Arvaa luku väliltä 1-10. Kirjoita 0, kun haluat lopettaa.");
			while (luku != 0) {
				object = arvuuttaja.liityPeliin();
				System.out.println("Anna luku:");
				luku = lukija.nextInt();
				arvuuttaja.arvaus(this, object);
			}
			
			System.out.println("Peli ohi");
			
		}
		
		public int getLuku() {
			return luku;
		}
	

}
