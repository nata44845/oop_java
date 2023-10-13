package ru.gb.family_tree.View.commands;

import ru.gb.family_tree.View.ConsoleUI;

public class SaveData extends Command{

    public SaveData(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить данные";
    }

    public void execute(){
        consoleUI.saveData();
    }
}
