package structural.proxy;

//https://www.youtube.com/watch?v=EzDkgArMO3U&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=16

//Заместитель — это структурный паттерн проектирования, который позволяет подставлять вместо реальных
// объектов специальные объекты-заменители.
// Эти объекты перехватывают вызовы к оригинальному объекту, позволяя сделать что-то до или после
// передачи вызова оригиналу.

public class Client {
    public static void main(String[] args) {
//        Project project = new RealProject("git.com");
//        project.run();

        Project project = new Proxy("git.com");
        project.run();
    }
}
