package ru.gb.family_tree.Model.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ru.gb.family_tree.Model.comparators.ComparatorByBirthDate;
import ru.gb.family_tree.Model.comparators.ComparatorByName;

public class FamilyTree<E extends TreeItem> implements Serializable,Iterable<E>{
    private int id_human;
    private List<E> itemList;

    public FamilyTree() {
        itemList = new ArrayList<>();
        id_human = 1;
    }

    public void addItem(E human) {
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

    public int getTreeSize() {
        return itemList.size();
    }

    public E getTreeItem(int number) {
        for (int i = 0; i<itemList.size(); i++)
            if (itemList.get(i).getId() == number)
                return itemList.get(i);
        return null;
    }

}
