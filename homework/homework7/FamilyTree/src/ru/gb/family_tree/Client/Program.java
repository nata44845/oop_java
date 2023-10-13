package ru.gb.family_tree.Client;

import ru.gb.family_tree.View.ConsoleUI;

public class Program {
    public static void main(String[] args) {
        ConsoleUI console = new ConsoleUI();
        console.createData();
        console.start();
    }
    
}
