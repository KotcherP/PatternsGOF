package structural.proxy;

//сделаем ленивую ссылку.Будем качать проект не при создании объекта,а при вызове load()
public class Proxy implements Project {
    private String url = "";
    private RealProject realProject;

    public Proxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realProject == null){
            realProject = new RealProject(url);
        }

        realProject.run();
    }
}
