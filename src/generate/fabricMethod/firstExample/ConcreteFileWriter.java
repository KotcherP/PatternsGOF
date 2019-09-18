package generate.fabricMethod.firstExample;

//запись в текстовый файл
public class ConcreteFileWriter extends AbstractWriter{
    @Override
    public void write(Object context) {
        System.out.println("This ConcreteFileWriter");
    }
}
