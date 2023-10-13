package solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
    }

    public double getArea() {
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
            // if (shape instanceof RightTriangle) {
            //     RightTriangle triangle = (RightTriangle) shape;
            //     sumArea += triangle.getKatet1() * triangle.getKatet2() / 2.0;
            // }
            // if (shape instanceof Square) {
            //     Square square = (Square) shape;
            //     sumArea += Math.pow(square.getSide(), 2);
            // }
        }

        return sumArea;
    }
}
