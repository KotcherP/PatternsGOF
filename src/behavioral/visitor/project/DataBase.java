package behavioral.visitor.project;

import behavioral.visitor.dev.Developer;

public class DataBase implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
