package ru.gb.family_tree.Model.tree;

import java.time.LocalDate;

public interface TreeItem {
    int getId();
    void setId(int id);
    String getFullInfo();
    LocalDate getBirthDate();
    String getFirstName();
    
}
