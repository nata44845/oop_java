package ru.gb.family_tree.View;

import ru.gb.family_tree.Model.gender.Gender;
import ru.gb.family_tree.Model.human.Human;
import ru.gb.family_tree.Presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {

    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    public void createData() {
        Human person = presenter.addItem("Иван",null,"Иванов",LocalDate.parse("1920-12-05"),
        null,null,null,null);

        presenter.addItem("Петр","Иванович","Иванов",
        LocalDate.parse("1960-01-23"),LocalDate.parse("2000-05-23"),Gender.Male,person,null);

        person = presenter.addItem("Матвей","Иванович","Иванов",
        null,null,null,person,null);

        person = presenter.addItem("Марина","Петровна","Иванова",LocalDate.parse("2000-12-22"),null,
        Gender.Female, person, null);
    }


    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        hello();
        while (work){
            printMenu();
            execute();
        }
    }

    public void finish() {
        System.out.println("До свидания");
        work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getTreeInfo() {
        presenter.getTreeInfo();
    }

    public void addItem() {
        System.out.println("Введите Фамилию");
        String lastName = scanner.nextLine();
        System.out.println("Введите Имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите Отчество");
        String middleName = scanner.nextLine();

        System.out.println("Укажите дату рождения (0000-00-00)");
        String birthString = scanner.nextLine();
        LocalDate birthDate = null;
        if (birthString != "") 
            birthDate = LocalDate.parse(birthString);

        System.out.println("Укажите дату смерти");
        String deathString = scanner.nextLine();
        LocalDate deathDate = null;
        if (deathString != "") 
            deathDate = LocalDate.parse(deathString);

        System.out.println("Укажите Пол М/Ж");
        String genderString = scanner.nextLine();
        Gender gender = null;
        if (genderString.equals("Ж"))
            gender = Gender.Female;
        if (genderString.equals("М"))
            gender = Gender.Male;

        presenter.getTreeInfo();

        System.out.println("Укажите отца");
        String fatherString = scanner.nextLine();
        Human father = null;
        if (checkTextForInt(fatherString)){
            int fatherIdx = Integer.parseInt(fatherString);
            if (fatherIdx>0 && fatherIdx<=presenter.getTreeSize()) {
                father = presenter.getTreeItem(fatherIdx);
            } 
        }

        System.out.println("Укажите мать");
        String motherString = scanner.nextLine();
        Human mother = null;
        if (checkTextForInt(motherString)){
            int motherIdx = Integer.parseInt(motherString);
            if (motherIdx>0 && motherIdx<=presenter.getTreeSize()) {
                mother = presenter.getTreeItem(motherIdx);
            } 
        }

        presenter.addItem(lastName, middleName, firstName, birthDate, deathDate, gender,father,mother);
    }

    private void hello(){
        System.out.println("Доброго времени суток!");
    }

    private void execute(){
        String line = scanner.nextLine();
        if (checkTextForInt(line)){
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)){
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkTextForInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
            //inputError();
            return false;
        }
    }

    private boolean checkCommand(int numCommand){
        if (numCommand <= menu.getSize()){
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void printMenu(){
        System.out.println(menu.menu());
    }

    private void inputError(){
        System.out.println(INPUT_ERROR);
    }
}
