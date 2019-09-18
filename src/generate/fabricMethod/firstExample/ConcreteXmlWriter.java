package generate.fabricMethod.firstExample;

//запись в документ
public class ConcreteXmlWriter extends AbstractWriter {
    @Override
    public void write(Object context) {
        System.out.println("This ConcreteXmlWriter");
    }
}
