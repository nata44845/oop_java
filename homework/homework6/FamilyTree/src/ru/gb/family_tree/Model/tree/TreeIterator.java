package ru.gb.family_tree.Model.tree;

import java.util.Iterator;
import java.util.List;

public class TreeIterator<E extends TreeItem> implements Iterator<E> {
    private int index;
    private List<E> itemList;

    public TreeIterator(List<E> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean hasNext() {
        return itemList.size()> index;
    }

    @Override
    public E next() {
        return itemList.get(index++);
    }
}
