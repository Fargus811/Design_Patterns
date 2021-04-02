package main.java.com.sergeev.behavioral_pattern.strategy.entity;

import main.java.com.sergeev.behavioral_pattern.strategy.example_strategy.PayStrategy;

/**
 * Класс заказа. Ничего не знает о том каким способом (стратегией) будет
 * рассчитываться клиент, а просто вызывает метод оплаты. Все остальное стратегия
 * делает сама.
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Здесь мы могли бы забрать и сохранить платежные данные из стратегии.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
