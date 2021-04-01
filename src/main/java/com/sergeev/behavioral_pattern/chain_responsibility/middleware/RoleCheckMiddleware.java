package main.java.com.sergeev.behavioral_pattern.chain_responsibility.middleware;

/**
 * Конкретный элемент цепи обрабатывает запрос по-своему. Проверка на роль пользователя.
 */
public class RoleCheckMiddleware extends Middleware {

    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}