class Observer {
    WeatherData myReference;
    Float myTemp;
    Float myHumidity;
    Float myPressure;

    public void update(){
        myTemp =myReference.temp;
        myHumidity = myReference.humidity;
        myPressure =myReference.pressure;
        
    }