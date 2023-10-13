package creational.builder.builder;

public abstract class BusinessCardBuilder {
    private BusinessCard card;

    void createCard(){
        card = new BusinessCard();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildSize();

    BusinessCard getCard() {
        return card;
    }

    public BusinessCard build() {
        createCard();
        buildName();
        buildPrice();
        buildSize();
        return getCard();
    }
}
