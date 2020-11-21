package main;

public class CelsiusTempAdapterImp implements CelsiusTempAdapter {
	private KelvinTemperature thermometer;
	
	public CelsiusTempAdapterImp(KelvinTemperature thermometer2) {
		this.thermometer = thermometer2;
	}

	@Override
	public double getTemperature() {
		return convertKelvinToCelsius(thermometer.getTemperature());
	}
	
	private double convertKelvinToCelsius(double k) {
		return k - 273.15;
	}

}
