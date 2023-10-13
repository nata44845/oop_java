package ru.gb.family_tree.Presenter;

import java.time.LocalDate;

import ru.gb.family_tree.Model.gender.Gender;
import ru.gb.family_tree.Model.human.Human;
import ru.gb.family_tree.Model.tree.FamilyTree;
import ru.gb.family_tree.View.View;

public class Presenter {
    private View view;
    private FamilyTree<Human> tree;

    public Presenter(View view) {
        this.tree = new FamilyTree<>();
        this.view = view;
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
}
