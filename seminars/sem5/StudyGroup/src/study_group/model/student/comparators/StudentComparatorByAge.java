package study_group.model.student.comparators;

import study_group.model.group.GroupItem;

import java.util.Comparator;

public class StudentComparatorByAge<T extends GroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
