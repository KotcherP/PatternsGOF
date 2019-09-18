package behavioral.visitor;

//https://www.youtube.com/watch?v=IcPftlAIIXg&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=28

import behavioral.visitor.dev.Developer;
import behavioral.visitor.dev.JuniorDeveloper;
import behavioral.visitor.dev.SeniorDeveloper;
import behavioral.visitor.project.Project;

//Посетитель — это поведенческий паттерн проектирования, который позволяет добавлять
// в программу новые операции, не изменяя классы объектов, над которыми эти операции могут выполняться.
public class Client {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action");
        project.beWritten(junior);

        System.out.println("=================");

        System.out.println("Senior in action");
        project.beWritten(senior);


    }
}
