package behavioral.visitor.project;

import behavioral.visitor.dev.Developer;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
