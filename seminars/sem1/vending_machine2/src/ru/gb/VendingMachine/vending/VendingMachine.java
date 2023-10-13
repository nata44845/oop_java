package ru.gb.VendingMachine.vending;

import java.util.ArrayList;
import java.util.List;

import ru.gb.Product.Product;

public class VendingMachine {
    private int id_product;
    List<Product> productList;

    public VendingMachine() {
        productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        product.setId(id_product++);
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public String getProductsInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список продукутов: \n");
        for (Product product: productList) {
            sb.append(product);
            sb.append("\n");
        }
        return sb.toString();
    }
}
