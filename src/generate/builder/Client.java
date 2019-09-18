package generate.builder;

import generate.builder.control.Director;
import generate.builder.project.EnterpriseWebSite;
import generate.builder.scheme.WebSite;

//Строитель — это порождающий паттерн проектирования, который позволяет создавать сложные объекты пошагово.
// Строитель даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebSite());
        WebSite webSite = director.buildWebSite();

        System.out.println(webSite);
    }
}
