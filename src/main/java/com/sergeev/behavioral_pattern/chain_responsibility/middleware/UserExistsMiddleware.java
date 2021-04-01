package main.java.com.sergeev.behavioral_pattern.chain_responsibility.middleware;

import main.java.com.sergeev.behavioral_pattern.chain_responsibility.server.Server;

/**
 * Конкретный элемент цепи обрабатывает запрос по-своему. Проверка email и пароля пользователя.
 */
public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
