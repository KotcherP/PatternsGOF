package behavioral.mediator;

import behavioral.mediator.users.User;

import java.util.ArrayList;
import java.util.List;

//выступает в роли посредника
public class SimpleTextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin){
        this.admin = admin;
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u:users
             ) {
            if(u!=user){
                u.getMessage(message);
            }
        }

        admin.getMessage(message);
    }
}
