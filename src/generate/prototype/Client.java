package generate.prototype;

//Прототип — это порождающий паттерн проектирования,
// который позволяет копировать объекты, не вдаваясь в подробности их реализации.

public class Client {

    public static void main(String[] args) {
        Project project = new Project(10);

        System.out.println(project);

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project projectClone = projectFactory.cloneProject();

        System.out.println(projectClone);
    }

}
