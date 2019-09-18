package behavioral.visitor.dev;

import behavioral.visitor.project.DataBase;
import behavioral.visitor.project.ProjectClass;
import behavioral.visitor.project.Test;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing bad class");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop database");
    }

    @Override
    public void create(Test test) {
        System.out.println("create bad test");
    }
}
