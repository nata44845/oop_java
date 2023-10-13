package ru.gb.family_tree;

import java.time.LocalDate;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human person1 = new Human("Иван","Иванов");
        Human person2 = new Human("Петр","Иванович","Иванов");
        Human person3 = new Human("Матвей","Иванович","Иванов");
        Human person4 = new Human("Марина","Петровна","Иванова",LocalDate.parse("2000-12-22"),Gender.Female);
        Human person5 = new Human("Матвей","Иванович","Иванов");

        person2.setFather(person1);
        person3.setFather(person1);
        person5.setFather(person1);
        person4.setFather(person2);

        System.out.println(person1.getChildren());
        System.out.println(person2.getChildren());

        familyTree.addHuman(person1);
        familyTree.addHuman(person2);
        familyTree.addHuman(person3);
        familyTree.addHuman(person4);

        System.out.println(familyTree.getTreeInfo());

    }
    
}
