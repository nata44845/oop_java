package ru.gb.family_tree.human.comparators;

import java.util.Comparator;

import ru.gb.family_tree.human.Human;

public class HumanComparatorByBirthDate implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getBirthDate() == null && o2.getBirthDate() == null) return 0;
        if (o1.getBirthDate() == null && o2.getBirthDate() != null) return 1;
        if (o1.getBirthDate() != null && o2.getBirthDate() == null) return -1;
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}