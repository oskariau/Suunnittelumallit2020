package main;

public class FahrenheitTempAdapterImp implements FahrenheitTempAdapter {
	private KelvinTemperature thermometer;
	
	public FahrenheitTempAdapterImp(KelvinTemperature thermometer) {
		this.thermometer = thermometer;
	}
	
	@Override
	public double getTemperature() {
		return convertKelvinToFahrenheit(thermometer.getTemperature());
	}
		
	private double convertKelvinToFahrenheit(double k) {
		return (k - 273.15)*1.8 + 32;
	}

}
