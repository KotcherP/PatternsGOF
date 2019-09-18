package generate.abstractFactory.teamBank;

import generate.abstractFactory.teamInt.Analyst;

public class AnalystBank implements Analyst {
    @Override
    public void writeFT() {
        System.out.println("analyst bank");
    }
}
