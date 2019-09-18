package generate.fabricMethod.firstExample;

import java.io.File;

public class Test {
    public static void main(String[] args) {

        File f = new File("?");
        AbstractWriter aw = new FactoryMethod().getWriter(f);
        aw.write(f);
    }
}
