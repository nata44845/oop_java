package taxi;

public class Uber extends Taxi {
    @Override
    public void drive(String address) {
        System.out.println("убер такси привествует вас!");
    }
}
