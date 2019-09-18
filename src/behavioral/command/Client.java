package behavioral.command;

import behavioral.command.com.DeleteCommand;
import behavioral.command.com.InsertCommand;
import behavioral.command.com.SelectCommand;
import behavioral.command.com.UpdateCommand;

//https://www.youtube.com/watch?v=T3oXyVYmkyY&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=19

//Команда — это поведенческий паттерн проектирования, который превращает запросы в объекты, позволяя передавать их
// как аргументы при вызове методов, ставить запросы в очередь, логировать их, а также поддерживать отмену операций.

public class Client {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
