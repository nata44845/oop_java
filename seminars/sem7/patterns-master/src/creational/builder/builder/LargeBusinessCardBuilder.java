package creational.builder.builder;

public class LargeBusinessCardBuilder extends BusinessCardBuilder {

    @Override
    void buildName() {
        getCard().setName("Большая визитка");
    }

    @Override
    void buildPrice() {
        getCard().setPrice(150);
    }

    @Override
    void buildSize() {
        getCard().setSize(new int[]{25, 20});
    }

}
