package ru.gb.family_tree.View.commands;

import ru.gb.family_tree.View.ConsoleUI;

public class GetTreeInfo extends Command {
    public GetTreeInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список";
    }

    public void execute(){
        consoleUI.getTreeInfo();
    }
}
