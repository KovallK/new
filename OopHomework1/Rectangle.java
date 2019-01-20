package pl.sda.javastart.OopHomework1;

import java.awt.*;
import java.util.ArrayList;

public class Rectangle extends Figure {
    Point p;
    double width;
    double height;


    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getCircuit() {
        return 2 * width + 2 * height;
    }

    @Override
    ArrayList<Point> getEdges() {
        return new ArrayList<Point>();
    }
}
