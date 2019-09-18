package behavioral.mediator;

import behavioral.mediator.users.Admin;
import behavioral.mediator.users.SimpleUser;
import behavioral.mediator.users.User;

//https://www.youtube.com/watch?v=ZnyNsrcLl2I&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=22

//Посредник — это поведенческий паттерн проектирования, который позволяет уменьшить
// связанность множества классов между собой, благодаря перемещению этих связей в один класс-посредник.

public class Client {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"admin");
        User user1 = new SimpleUser(chat,"user 1");
        User user2 = new SimpleUser(chat,"user 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello");
        admin.sendMessage("hi, i am admin");
    }
}
