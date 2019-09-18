package behavioral.visitor.dev;

import behavioral.visitor.project.DataBase;
import behavioral.visitor.project.ProjectClass;
import behavioral.visitor.project.Test;

public interface Developer {
    void create(ProjectClass projectClass);
    void create(DataBase dataBase);
    void create(Test test);

}
