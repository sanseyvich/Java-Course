package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 2/29/2016.
 * <p>
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 * helloName("Bob") → "Hello Bob!"
 * helloName("Alice") → "Hello Alice!"
 * helloName("X") → "Hello X!"
 */
public class _1CodingBatString1_1 {
    public String helloName(String name) {
        return String.format("Hello %s!", name);
    }
}
