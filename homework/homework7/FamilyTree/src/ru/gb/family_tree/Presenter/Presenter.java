package ru.gb.family_tree.Presenter;

import java.time.LocalDate;

import ru.gb.family_tree.Model.gender.Gender;
import ru.gb.family_tree.Model.human.Human;
import ru.gb.family_tree.Model.tree.FamilyTree;
import ru.gb.family_tree.View.View;
import ru.gb.family_tree.file_work.FileHandler;
import ru.gb.family_tree.file_work.Writable;

public class Presenter {
    private View view;
    private FamilyTree<Human> tree;
    Writable wr;

    public Presenter(View view, Writable wr) {
        this.tree = new FamilyTree<>();
        this.view = view;
        this.wr = wr;
    }

    public Human addItem(String firstName, String middleName,String lastName, 
    LocalDate birthDate, LocalDate deathDate, Gender gender,Human father, Human mother) {
       Human person = new Human(firstName, middleName,lastName,birthDate,deathDate,gender,father,mother);
       tree.addItem(person);
       return person;
    }

    public void getTreeInfo() {
        view.printAnswer(tree.getTreeInfo());
    }

    public void sortByAge() {
        tree.sortByAge();
        getTreeInfo();
    }

    public void sortByName() {
        tree.sortByName();
        getTreeInfo();
    }

    public int getTreeSize() {
        return tree.getTreeSize();
    }

    public Human getTreeItem(int number) {
        return tree.getTreeItem(number);
    }

    public void saveData(String fileName) {

        if (wr.write(tree,fileName)) view.printAnswer("Файл сохранен");
        else view.printAnswer("Ошибка сохранения");
    }

    public void loadData(String fileName) {
        Object obj = wr.read(fileName);
        if (obj instanceof FamilyTree) {
            tree = (FamilyTree) obj;
            view.printAnswer("Данные загружены");
        }
        else view.printAnswer("Ошибка загрузки данных");
    }

    public void clearData() {
        tree = new FamilyTree<>();
        view.printAnswer("Данные удалены");
    }

    public void findData(String name) {
        boolean flag = false;
        for (Human human : tree) {
            if (human.getFirstName().equals(name)) {
                view.printAnswer(human.getFullInfo());
                flag = true;
            }
        }
        if (flag == false) view.printAnswer("Данные не найдены");
    }
}
