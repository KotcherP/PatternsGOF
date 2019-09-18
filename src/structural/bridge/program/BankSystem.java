package structural.bridge.program;

import structural.bridge.dev.Developer;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("develop bank");
        developer.writeCode();
    }
}
