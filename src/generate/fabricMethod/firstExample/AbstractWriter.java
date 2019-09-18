package generate.fabricMethod.firstExample;

/*http://www.javenue.info/post/17
Класс AbstractWriter будет представлять абстракцию для записи в некоторый контекст
(будь то XML-документ или текстовый файл).
*/

public abstract class AbstractWriter {
    public abstract void write(Object context);
}
