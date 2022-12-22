package com.example.finalproject;

public class Restaurant {
    public String name;
    public int distance;
    public String density;

    public Restaurant(String name, int distance, String density) {
        this.name = name;
        this.distance = distance;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }
}
