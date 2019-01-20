package pl.sda.javastart.OopHomework1;

import java.awt.*;
import java.util.ArrayList;

public class Circle extends Figure {
    Point p;
    double r;

    public Point getP() {
        return p;
    }

    public void setP( Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double getCircuit() {
        return 2 * Math.PI * r;
    }

    @Override
    ArrayList<Point> getEdges() {
        return new ArrayList<Point>();
    }
}
