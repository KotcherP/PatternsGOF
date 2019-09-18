package generate.fabricMethod.secondExample.factory;

import generate.fabricMethod.secondExample.dev.Developer;
import generate.fabricMethod.secondExample.dev.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
