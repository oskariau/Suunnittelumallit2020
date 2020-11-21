package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KelvinTemperature thermometer = new Thermometer();
		CelsiusTempAdapter celsius = new CelsiusTempAdapterImp(thermometer);
		FahrenheitTempAdapter fahrenheit = new FahrenheitTempAdapterImp(thermometer);
		
		System.out.println("Temperature in Kelvins: " + thermometer.getTemperature() + " K");
		System.out.println("Temperature in Celsius: " + celsius.getTemperature() + " C");
		System.out.println("Temperature in Fahrenheit: " + fahrenheit.getTemperature() + " F");
	}

}
