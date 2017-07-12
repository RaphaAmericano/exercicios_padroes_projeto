package observer;
//Exercicio Página 49
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable){
		observable.addObserver(this);
		WeatherData weatherData = (WeatherData) observable;
	}
	public void update(Observable observable, Object arg){
		if( observable instaceof WeatherData){
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}
	public void display(){
		// display
	}
}
