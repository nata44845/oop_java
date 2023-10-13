package ru.gb.family_tree.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ru.gb.family_tree.comparators.ComparatorByBirthDate;
import ru.gb.family_tree.comparators.ComparatorByName;

public class FamilyTree<E extends TreeItem> implements Serializable,Iterable<E>{
    private int id_human;
    private List<E> itemList;

    public FamilyTree() {
        itemList = new ArrayList<>();
        id_human = 1;
    }

    public void addHuman(E human) {
        human.setId(id_human++);
        itemList.add(human);
    }

    public List<E> getProductList() {
        return itemList;
    }

    public String getTreeInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список персон: \n");
        for (E human: itemList) {
            sb.append(human.getFullInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new TreeIterator<>(itemList);
    }

    public void sortByName() {
        itemList.sort(new ComparatorByName<>());
    }

    public void sortByAge() {
        itemList.sort(new ComparatorByBirthDate<>());
    }

}
