package structural.bridge;

import structural.bridge.dev.JavaDeveloper;
import structural.bridge.dev.PhpDeveloper;
import structural.bridge.program.BankSystem;
import structural.bridge.program.Program;
import structural.bridge.program.StockExchange;

//Мост — это структурный паттерн проектирования,
// который разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию,
// позволяя изменять их независимо друг от друга.

public class ProgramCreator {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new PhpDeveloper())
        };

        for (Program program:programs
             ) {
            program.developProgram();
        }
    }



}
