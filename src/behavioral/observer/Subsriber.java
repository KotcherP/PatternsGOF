package behavioral.observer;

import java.util.List;

public class Subsriber implements Observer{
    private String name;

    public Subsriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + " vacancy changes: " + vacancies);

//        for (String change:vacancies
//             ) {
//            System.out.println(change);
//        }
    }
}
