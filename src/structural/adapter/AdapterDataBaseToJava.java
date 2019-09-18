package structural.adapter;

public class AdapterDataBaseToJava extends JavaApplication implements Database{
    @Override
    public void create() {
        createJava();
    }

    @Override
    public void select() {
        selectJava();
    }

    @Override
    public void update() {
        updateJava();
    }

    @Override
    public void delete() {
        deleteJava();
    }
}
