package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new JuniorDeveloper();
        Developer developer2 = new MiddleDeveloper(developer1);
        Developer developer3 = new SeniorDeveloper(developer2);

        System.out.println(developer3.makeJob());
    }
}
