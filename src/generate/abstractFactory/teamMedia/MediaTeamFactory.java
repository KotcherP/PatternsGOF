package generate.abstractFactory.teamMedia;

import generate.abstractFactory.teamInt.Analyst;
import generate.abstractFactory.teamInt.Developer;
import generate.abstractFactory.teamInt.TeamFactory;

public class MediaTeamFactory implements TeamFactory {
    @Override
    public Developer createDeveloper() {
        return new DeveloperMedia();
    }

    @Override
    public Analyst createAnalyst() {
        return new AnalystMedia();
    }
}
