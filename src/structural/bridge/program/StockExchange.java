package structural.bridge.program;

import structural.bridge.dev.Developer;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("develop stock");
        developer.writeCode();
    }
}
