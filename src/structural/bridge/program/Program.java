package structural.bridge.program;

import structural.bridge.dev.Developer;

public abstract class Program {
    public Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
