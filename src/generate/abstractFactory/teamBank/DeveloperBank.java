package generate.abstractFactory.teamBank;

import generate.abstractFactory.teamInt.Developer;

public class DeveloperBank implements Developer {
    @Override
    public void writeCode() {
        System.out.println("developer bank");
    }
}
