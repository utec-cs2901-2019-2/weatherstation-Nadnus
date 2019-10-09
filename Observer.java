class Observer {
    WeatherData myReference;
    float myTemp;
    float myHumidity;
    float myPressure;

    public void update() {
        myTemp = myReference.temp;
        myHumidity = myReference.humidity;
        myPressure = myReference.pressure;
    }
}