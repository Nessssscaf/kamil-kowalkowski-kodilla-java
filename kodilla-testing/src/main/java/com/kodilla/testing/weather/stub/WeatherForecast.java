package com.kodilla.testing.weather.stub;
import java.text.DecimalFormat;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        List<Double> resultList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultList.add(temperature.getValue());
        }

        double sum = 0.0;
        for (int i=0; i<resultList.size(); i++) {
            sum += resultList.get(i);
        }
        double average = sum / resultList.size();
        return average;
    }

    public double medianTemperature() {
        List<Double> resultList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultList.add(temperature.getValue());
        }
        Collections.sort(resultList);
        double median;
        if (resultList.size() % 2 == 0) {
            median = ((double) resultList.get(resultList.size() / 2) + (double) resultList.get(resultList.size() / 2 - 1))/2;
        } else { median = ((double) resultList.get((resultList.size() -1) / 2));}
        return median;
    }
}

