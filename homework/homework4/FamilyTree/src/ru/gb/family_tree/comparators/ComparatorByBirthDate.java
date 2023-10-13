package ru.gb.family_tree.comparators;

import java.util.Comparator;

import ru.gb.family_tree.tree.TreeItem;

public class ComparatorByBirthDate<E extends TreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        if (o1.getBirthDate() == null && o2.getBirthDate() == null) return 0;
        if (o1.getBirthDate() == null && o2.getBirthDate() != null) return 1;
        if (o1.getBirthDate() != null && o2.getBirthDate() == null) return -1;
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}