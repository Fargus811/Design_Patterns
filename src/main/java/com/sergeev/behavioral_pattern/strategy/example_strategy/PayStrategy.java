package main.java.com.sergeev.behavioral_pattern.strategy.example_strategy;

/**
 * Общий интерфейс всех стратегий.
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}