package com.sonarqube;
import java.util.concurrent.atomic.AtomicInteger; 

/**
 * Hello world!!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        AtomicInteger a = new AtomicInteger(5);
        AtomicInteger b = new AtomicInteger(5);

        // Comparação incorreta usando equals()
        if (a.equals(b)) {
            System.out.println("A e B são iguais (equals)");  // Não será impresso, pois equals() verifica referência.
        } else {
            System.out.println("A e B NÃO são iguais (equals)");
        }
    }
}