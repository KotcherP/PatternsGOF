package behavioral.observer;

//https://www.youtube.com/watch?v=br5201sWOHM&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=24

//Наблюдатель — это поведенческий паттерн проектирования, который создаёт механизм подписки,
// позволяющий одним объектам следить и реагировать на события, происходящие в других объектах.
public class Client {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("first");
        jobSite.addVacancy("second");

        Observer firstSubscriber = new Subsriber("Alex");
        Observer secondSubscriber = new Subsriber("John");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("third");

        jobSite.removeVacancy("first");


    }
}
