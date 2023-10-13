package ru.gb.family_tree.Model.comparators;

import java.util.Comparator;

import ru.gb.family_tree.Model.tree.TreeItem;

public class ComparatorByName<E extends TreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
