package pl.sda.javastart.OopHomework1;

import java.util.ArrayList;

public class Square extends Figure {
    Point p;
    Point p2;
    Point p3;
    Point p4;



    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    double side;

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return Math.pow(side,2);
    }

    @Override
    double getCircuit() {
        return side*4;
    }

    @Override
    ArrayList<Point> getEdges() {
       ArrayList points= new ArrayList<>(4);
       points.add(getP());
       points.add(getP2());
       points.add(getP3());
       points.add(getP4());

       return points;

    }
}
