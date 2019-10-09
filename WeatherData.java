import java.util.ArrayList;

class WeatherData {
    private ArrayList<Observer> myObservers;
    private float temperature;
    private float humidity;
    private float pressure;

    public void registerObserver(Observer e) {
        myObservers.add(e);
    }

    public void removeObserver(Observer e) {
        myObservers.remove(e);
    }

    public void notifyObservers() {
        for (Observer a : myObserver) {
            a.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    public measurements extends TimerTask
}