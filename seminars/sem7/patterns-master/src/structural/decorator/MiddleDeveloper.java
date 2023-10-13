package structural.decorator;

public class MiddleDeveloper extends DeveloperDecorator {
    public MiddleDeveloper(Developer developer) {
        super(developer);
    }

    String makeReview(){
        return "Делаю проверку кода.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeReview();
    }
}
