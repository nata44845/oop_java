package structural.decorator;

public class SeniorDeveloper extends DeveloperDecorator {
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    String makeReview(){
        return "Делаю отчеты.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeReview();
    }
}
