package solid.lsp;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setSideA(int sideA) {
        super.setSideA(sideA);
        super.setSideB(sideA);
    }

    @Override
    public void setSideB(int sideB) {
        super.setSideA(sideB);
        super.setSideB(sideB);
    }

    @Override
    public int getArea() {
        return (int) Math.pow(getSideA(), 2);
    }
}
