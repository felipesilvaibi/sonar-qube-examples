package com.sonarqube;
import java.util.logging.Logger;

/**
 * Hello world!!
 *
 */
public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        int result;

        result = test(10, 5);
        LOGGER.info("Resultado: " + result);

        // result = test(10, 0); quebra!
    }

    public static int test(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}
