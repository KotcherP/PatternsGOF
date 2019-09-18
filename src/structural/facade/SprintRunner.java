package structural.facade;

//Фасад — это структурный паттерн проектирования,
// который предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.

//https://www.youtube.com/watch?v=7thoI-_K9EU&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=14

public class SprintRunner {
    public static void main(String[] args) {
 //изначально не удобно,поэтому создается фасад класс
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
//
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);

        FacadeClass facadeClass = new FacadeClass();
        facadeClass.solveProblem();
    }
}
