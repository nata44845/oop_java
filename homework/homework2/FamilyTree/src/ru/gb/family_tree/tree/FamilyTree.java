package ru.gb.family_tree.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ru.gb.family_tree.human.Human;

public class FamilyTree implements Serializable{
    private int id_human;
    private List<Human> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
        id_human = 1;
    }

    public void addHuman(Human human) {
        human.setId(id_human++);
        humanList.add(human);
    }

    public List<Human> getProductList() {
        return humanList;
    }

    public String getTreeInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список персон: \n");
        for (Human human: humanList) {
            sb.append(human.getFullInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

}
