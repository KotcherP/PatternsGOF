package structural.composite;

import structural.composite.dev.Developer;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer dev){
        developers.add(dev);
    }

    public void removeDeveloper(Developer dev){
        developers.remove(dev);
    }

    public void createTeam(){
        System.out.println("Team create:");

        for (Developer dev:developers
             ) {
            dev.writeCode();
        }
    }
}
