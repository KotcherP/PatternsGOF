package structural.adapter;

//Адаптер — это структурный паттерн проектирования,
// который позволяет объектам с несовместимыми интерфейсами работать вместе.
//https://www.youtube.com/watch?v=VunUuXyJw2U&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=10

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterDataBaseToJava();
        database.create();
        database.select();
        database.update();
        database.delete();
    }
}
