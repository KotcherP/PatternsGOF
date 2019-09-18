package generate.abstractFactory.teamMedia;

import generate.abstractFactory.teamInt.Developer;

public class DeveloperMedia implements Developer {
    @Override
    public void writeCode() {
        System.out.println("developer media");
    }
}
