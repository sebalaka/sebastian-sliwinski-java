package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageCurrentTemperature(Map<String, Double> correctTemperaturesMap) {
        double sum = 0D;
        for (Map.Entry<String, Double> entry : correctTemperaturesMap.entrySet()) {
            sum += entry.getValue();
        }
        return sum / correctTemperaturesMap.size();
    }

    public double calculateMedianCurrentTemperatures(Map<String, Double> correctTemperaturesMap) {
        List<Double> values = new LinkedList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            values.add(temperature.getValue());
        }
        Collections.sort(values);
        if (values.size() % 2 == 0) {
            return (values.get(values.size() / 2) + values.get(values.size() / 2 - 1)) / 2;
        } else {
            return values.get(values.size() / 2);
        }
    }
}