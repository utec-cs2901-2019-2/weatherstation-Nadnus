import java.util.ArrayList;

class StatisticsDisplay {
    WeatherData myReference;
    private float max = -5000;
    private float min = 5000;
    private float average;
    private ArrayList<Float> temps;

    public void update() {
        temps.add(myReference.temperature);
        if (myReference.temperature > max) {
            max = myReference.temperature;
        } else if (min < myReference.temperature) {
            min = myReference.temperature;

        }
        float myAverage;
        for (float myTemp : temps) {
            myAverage = myAverage + myTemp;
        }
        myAverage = myAverage / temps.size();
    }

}