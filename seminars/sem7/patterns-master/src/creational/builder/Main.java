package creational.builder;

import creational.builder.builder.BusinessCard;
import creational.builder.builder.BusinessCardBuilder;
import creational.builder.builder.SmallBusinessCardBuilder;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder builder = new SmallBusinessCardBuilder();
        BusinessCard card = builder.build();

        System.out.println(card);
    }
}
