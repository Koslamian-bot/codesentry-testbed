package demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;           // no zero check
    }

    public String findUserQuery(String name) {
        return "SELECT * FROM users WHERE name = '" + name + "'";   // SQL injection
    }
}