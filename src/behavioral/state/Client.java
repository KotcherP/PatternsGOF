package behavioral.state;

//https://www.youtube.com/watch?v=gpY98f7A_8M&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=25

//Состояние — это поведенческий паттерн проектирования,
// который позволяет объектам менять поведение в зависимости от своего состояния.
// Извне создаётся впечатление, что изменился класс объекта.

public class Client {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
