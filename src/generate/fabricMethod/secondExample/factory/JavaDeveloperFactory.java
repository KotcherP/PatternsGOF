package generate.fabricMethod.secondExample.factory;

import generate.fabricMethod.secondExample.dev.Developer;
import generate.fabricMethod.secondExample.dev.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
