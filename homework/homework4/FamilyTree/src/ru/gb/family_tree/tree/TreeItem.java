package ru.gb.family_tree.tree;

import java.time.LocalDate;

public interface TreeItem {
    void setId(int id);
    String getFullInfo();
    LocalDate getBirthDate();
    String getFirstName();
    
}
