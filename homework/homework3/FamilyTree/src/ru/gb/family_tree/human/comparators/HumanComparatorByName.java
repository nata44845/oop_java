package ru.gb.family_tree.human.comparators;

import java.util.Comparator;

import ru.gb.family_tree.human.Human;

public class HumanComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
