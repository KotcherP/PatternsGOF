package generate.fabricMethod.firstExample;

import org.w3c.dom.Document;

import java.io.File;

/*
Вступление: Требования к разного рода програмным продуктам постоянно растут.
Отчеты по выполнению операций приложения должны формироваться в разном виде: XML, HTML, текст и т.д.
Это как раз тот случай, когда удобно использовать паттерн Factory.

Используйте паттерн Factory в следующих случаях:
класс не имеет информации о том, какой тип объекта он должен создать;
класс передает ответственность по созданию объектов наследникам;
необходимо создать объект в зависимости от входящих данных.
 */
public class FactoryMethod {
    public AbstractWriter getWriter(Object o){

        if(o instanceof File){
            return new ConcreteFileWriter();
        }else if(o instanceof Document){
            return new ConcreteXmlWriter();
        }
        else {
            throw new RuntimeException(o + " is not used");
        }

    }
}
