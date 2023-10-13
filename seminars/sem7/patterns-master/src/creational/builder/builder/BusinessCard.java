package creational.builder.builder;

import java.util.Arrays;

public class BusinessCard {
    private String name;
    private int[] size;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", size=" + Arrays.toString(size) +
                ", price=" + price +
                '}';
    }
}
