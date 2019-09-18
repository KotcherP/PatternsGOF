package structural.decorator;

import structural.decorator.dev.Developer;
import structural.decorator.dev.JavaDeveloper;
import structural.decorator.dev.JavaTeamLead;
import structural.decorator.dev.SeniorJavaDeveloper;

//Декоратор — это структурный паттерн проектирования,
// который позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные «обёртки».

//https://www.youtube.com/watch?v=2aB2B3b3bQA&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=13

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
