package ru.gb.family_tree.View.commands;

import ru.gb.family_tree.View.ConsoleUI;

public class FindData extends Command{

    public FindData(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Найти по имени";
    }

    public void execute(){
        consoleUI.findData();
    }
}
