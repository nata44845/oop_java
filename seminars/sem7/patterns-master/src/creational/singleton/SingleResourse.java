package creational.singleton;

public class SingleResourse {
    private static SingleResourse singleResourse;

    public synchronized static SingleResourse getSingleResourse() {
        if (singleResourse == null){
            singleResourse = new SingleResourse();
        }
        return singleResourse;
    }

    private SingleResourse() {
    }
}
