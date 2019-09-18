package generate.abstractFactory.project;

import generate.abstractFactory.teamBank.BankTeamFactory;
import generate.abstractFactory.teamInt.Analyst;
import generate.abstractFactory.teamInt.Developer;
import generate.abstractFactory.teamInt.TeamFactory;

public class Bank {
    public static void main(String[] args) {
        TeamFactory teamFactory = new BankTeamFactory();
        Analyst analyst = teamFactory.createAnalyst();
        Developer developer = teamFactory.createDeveloper();

        analyst.writeFT();
        developer.writeCode();
    }
}
