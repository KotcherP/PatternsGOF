package structural.flyweight;

import structural.flyweight.dev.Developer;
import structural.flyweight.dev.JavaDeveloper;
import structural.flyweight.dev.PhpDeveloper;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {

        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring java developer");
                    developer = new JavaDeveloper();
                    break;
                case "php":
                    System.out.println("Hiring php developer");
                    developer = new PhpDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }

        return developer;
    }
}
