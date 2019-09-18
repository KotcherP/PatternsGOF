package behavioral.visitor.dev;

import behavioral.visitor.project.DataBase;
import behavioral.visitor.project.ProjectClass;
import behavioral.visitor.project.Test;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing good class");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("recovery base");
    }

    @Override
    public void create(Test test) {
        System.out.println("fix test");
    }
}
