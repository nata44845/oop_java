package solid.lsp;

public class Order {
    private int price;
    private int qnt;

    public Order(int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    }

    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
