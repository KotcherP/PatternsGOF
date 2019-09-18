package generate.abstractFactory.teamBank;

import generate.abstractFactory.teamInt.Analyst;
import generate.abstractFactory.teamInt.Developer;
import generate.abstractFactory.teamInt.TeamFactory;

public class BankTeamFactory implements TeamFactory {
    @Override
    public Developer createDeveloper() {
        return new DeveloperBank();
    }

    @Override
    public Analyst createAnalyst() {
        return new AnalystBank();
    }
}
