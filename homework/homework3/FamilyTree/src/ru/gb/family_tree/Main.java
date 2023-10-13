package ru.gb.family_tree;

import java.time.LocalDate;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.FamilyTree;
import ru.gb.family_tree.file_work.FileHandler;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human person1 = new Human("Иван","Иванов",LocalDate.parse("1920-12-05"));
        Human person2 = new Human("Петр","Иванович","Иванов",
        LocalDate.parse("1960-01-23"),LocalDate.parse("2000-05-23"),Gender.Male);
        Human person3 = new Human("Матвей","Иванович","Иванов");
        Human person4 = new Human("Марина","Петровна","Иванова",LocalDate.parse("2000-12-22"),Gender.Female);

        person2.setFather(person1);
        person3.setFather(person1);
        person4.setFather(person2);

        // System.out.println(person1.getChildren());
        // System.out.println(person2.getChildren());

        familyTree.addHuman(person1);
        familyTree.addHuman(person2);
        familyTree.addHuman(person3);
        familyTree.addHuman(person4);

        System.out.println(familyTree.getTreeInfo());

        // FileHandler fh = new FileHandler();
        // if (fh.write(familyTree,"FamilyTree.info")) System.out.println("Файл сохранен");
        // else System.out.println("Ошибка сохранения файла");
        // FamilyTree familyTree2 = (FamilyTree) fh.read("FamilyTree.info");
        // System.out.println();
        // System.out.println("Считанное из файла дерево:");
        // if (familyTree2!=null) System.out.println(familyTree2.getTreeInfo());

        for (Human human: familyTree) {
            System.out.println(human.getFullName());
        }
        System.out.println();

        //Сортировка по имени
        familyTree.sortByName();
        System.out.println("Отсортировано по имени:");
        System.out.println(familyTree.getTreeInfo());

        //Сортировка по возрасту
        familyTree.sortByAge();
        System.out.println("Отсортировано по возрасту:");
        System.out.println(familyTree.getTreeInfo());

    }
    
}
