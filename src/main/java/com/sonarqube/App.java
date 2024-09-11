package com.sonarqube;
import java.util.logging.Logger;

/**
 * Hello world!!
 *
 */
public class App 
{
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        test("^");
        test("v");
        test(">");
        test("<");
        // App.test("x"); quebra!
    }

    public static void test(String param) {
        switch (param) {
        case "^":
            LOGGER.info("cima");
            break;
        case "v":
            LOGGER.info("baixo");
            break;
        case ">":
            LOGGER.info("direita");
            break;
        case "<":
            LOGGER.info("esquerda");
            break;
        // default:
        //     LOGGER.warning("comando inválido");
        //     break;
        }
    }
}