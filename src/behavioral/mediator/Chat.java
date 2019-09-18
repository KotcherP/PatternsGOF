package behavioral.mediator;

import behavioral.mediator.users.User;

public interface Chat {
    void sendMessage(String message, User user);
}
