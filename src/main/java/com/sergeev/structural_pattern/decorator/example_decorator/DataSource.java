package main.java.com.sergeev.structural_pattern.decorator.example_decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}