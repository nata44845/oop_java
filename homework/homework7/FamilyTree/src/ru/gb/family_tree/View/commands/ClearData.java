package ru.gb.family_tree.View.commands;

import ru.gb.family_tree.View.ConsoleUI;

public class ClearData extends Command{

    public ClearData(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Очистить данные";
    }

    public void execute(){
        consoleUI.clearData();
    }
}
