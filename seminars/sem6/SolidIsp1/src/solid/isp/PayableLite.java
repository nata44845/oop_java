package solid.isp;

public interface PayableLite {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
}