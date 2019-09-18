package behavioral.memento;

//https://www.youtube.com/watch?v=nu2CN3r4Jp0&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=23

//Снимок — это поведенческий паттерн проектирования,
// который позволяет сохранять и восстанавливать прошлые состояния объектов, не раскрывая подробностей их реализации.

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating new project");

        project.setVersionAndDate("version 1.0");
        System.out.println(project);

        System.out.println("Saving project to github");
        gitHubRepo.setSave(project.save());

        Thread.sleep(3000);

        project.setVersionAndDate("version 1.1");
        System.out.println(project);

        System.out.println("Rollback");

        project.load(gitHubRepo.getSave());
        System.out.println(project);
    }
}
