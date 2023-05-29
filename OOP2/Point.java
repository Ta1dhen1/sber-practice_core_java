package ru.sber.OOP2;

import java.util.Locale;
public class Point {
    private double x;
    private double y;
    public Point(){
        this.x = 0.0;
        this.y = 0.0;

    }
    public  Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return String.format(Locale.US, "(%.2f, %.2f)", this.x, this.y);
    }

}
