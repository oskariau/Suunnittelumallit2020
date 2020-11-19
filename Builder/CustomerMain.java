import java.util.List;

import taytteet.Täyte;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		McDonalds mcDonalds = new McDonalds();
		Hesburger hesburger = new Hesburger();
		
		mcDonalds.buildHamburger();
		hesburger.buildHamburger();
		
		System.out.println("Hesburgerin hampurilainen sisältää: ");
		List<Täyte> hamburgerList = hesburger.getBurger();
		
		for (Täyte i : hamburgerList) {
			System.out.println(i.getName());
		}
		System.out.println();
		
		StringBuilder str = mcDonalds.getBurger();
		System.out.println("McDonaldsin hampurilainen sisältää: ");
		System.out.println(str);
	}

}
