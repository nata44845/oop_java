package solid;

import solid.ocp.Canvas;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        System.out.printf("Сумма площадей фигур равна %f \n", canvas.getArea());
    }
}
