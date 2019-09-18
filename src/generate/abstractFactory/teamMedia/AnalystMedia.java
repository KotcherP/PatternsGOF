package generate.abstractFactory.teamMedia;

import generate.abstractFactory.teamInt.Analyst;

public class AnalystMedia implements Analyst {
    @Override
    public void writeFT() {
        System.out.println("analyst media");
    }
}
