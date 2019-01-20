package pl.sda.javastart.OopHomework1;

import java.util.ArrayList;

public class OopHomework1 {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        square.setSide(2.5);
        square.getEdges();
        circle.setR(3.5);
        circle.getEdges();
        rectangle.setWidth(3.2);
        rectangle.setHeight(4.8);
        rectangle.getEdges();




    }

}
