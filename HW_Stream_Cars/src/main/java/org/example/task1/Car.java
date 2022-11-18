package org.example.task1;

public class Car {
    private Cars cars;
    private int year;
    private double price;
    private Color color;
    private double volumeEngine;

    public Car(Cars cars, int year, double price, Color color, double volumeEngine){
        this.cars = cars;
        this.year = year;
        this.price = price;
        this.color = color;
        this.volumeEngine = volumeEngine;
    }

    @Override
    public String toString() {
        return String.format("   MODEL  | YEAR |  PRICE   | COLOR  | VOLUME ENGINE \n")
                + String.format(" %8s | %-4d | %-4.2f | %-6s | %.1f \n", cars, year, price, color, volumeEngine) +
                "----------------------------------------------------\n";
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }
}

enum Color{
    BLACK, RED, WHITE, BLUE, SILVER
}

enum Cars{
    FIESTA, FOCUS, MONDEO, FUSION, EDGE, MUSTANG, F150
}
