package generate.abstractFactory.project;

import generate.abstractFactory.teamInt.Analyst;
import generate.abstractFactory.teamInt.Developer;
import generate.abstractFactory.teamInt.TeamFactory;
import generate.abstractFactory.teamMedia.MediaTeamFactory;

public class Media {
    public static void main(String[] args) {
        TeamFactory teamFactory = new MediaTeamFactory();
        Analyst analyst = teamFactory.createAnalyst();
        Developer developer = teamFactory.createDeveloper();

        analyst.writeFT();
        developer.writeCode();
    }
}
