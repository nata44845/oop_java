package ru.gb.VendingMachine;

import ru.gb.Product.Bottle;
import ru.gb.Product.Product;
import ru.gb.VendingMachine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vending = new VendingMachine();

        Bottle product1 = new Bottle("Coca-cola", 150, 1.5);
        Product product2 = new Product("Milko", 100);
        vending.addProduct(product1);
        vending.addProduct(product2);
        System.out.println(vending.getProductsInfo());
    }
}
