package behavioral.visitor.project;

import behavioral.visitor.dev.Developer;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement pe:projectElements
             ) {
            pe.beWritten(developer);
        }
    }
}
