package ru.gb.family_tree.View.commands;

import ru.gb.family_tree.View.ConsoleUI;

public class AddItem extends Command{

    public AddItem(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить персону";
    }

    public void execute(){
        consoleUI.addItem();
    }
}
