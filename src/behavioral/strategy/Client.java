package behavioral.strategy;

//https://www.youtube.com/watch?v=rsB2exGsR4I&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=26

//Стратегия — это поведенческий паттерн проектирования,
// который определяет семейство схожих алгоритмов и помещает каждый из них
// в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
public class Client {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();
    }
}
