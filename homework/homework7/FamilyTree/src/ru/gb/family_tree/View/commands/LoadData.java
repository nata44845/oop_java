package ru.gb.family_tree.View.commands;

import ru.gb.family_tree.View.ConsoleUI;

public class LoadData extends Command{

    public LoadData(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Загрузить данные";
    }

    public void execute(){
        consoleUI.loadData();
    }
}
