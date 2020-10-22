package abstractfactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jasper jasper = new Jasper();
		
		System.out.println("Jasper opiskelee.");
		jasper.setVaateFactory(new AdidasVaateFactory());
		jasper.pue();
		jasper.naytaVaatteet();
		
		System.out.println("Jasper valmistuu.");
		jasper.setVaateFactory(new BossVaateFactory());
		jasper.pue();
		jasper.naytaVaatteet();
	}

}
