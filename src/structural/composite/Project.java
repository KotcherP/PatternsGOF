package structural.composite;

import structural.composite.dev.JavaDeveloper;
import structural.composite.dev.PhpDeveloper;

//Компоновщик — это структурный паттерн проектирования, который позволяет
// сгруппировать множество объектов в древовидную структуру,
// а затем работать с ней так, как будто это единичный объект.

public class Project {

    public static void main(String[] args) {
        Team team = new Team();
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new PhpDeveloper());

        team.createTeam();
    }
}
