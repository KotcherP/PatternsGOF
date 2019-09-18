package behavioral.command;

import behavioral.command.com.Command;

public class Developer {
    private Command insert;
    private Command select;
    private Command update;
    private Command delete;

    public Developer(Command insert, Command select, Command update, Command delete) {
        this.insert = insert;
        this.select = select;
        this.update = update;
        this.delete = delete;
    }

    public void insertRecord(){
        insert.execute();
    }
    public void selectRecord(){
        select.execute();
    }
    public void updateRecord(){
        update.execute();
    }
    public void deleteRecord(){
        delete.execute();
    }
}
