package behavioral.observer;

import java.util.List;

//Наблюдатель
public interface Observer {
    void handleEvent(List<String> vacancies);
}
