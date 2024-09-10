package com.sonarqube;

/**
 * Hello world!!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        

    

            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = 100;

            double fahrenheit = (celsius * 9/5) + 32;
    
            // Exibe a temperatura em Fahrenheit
            System.out.printf("A temperatura em Fahrenheit criando a mesma conta é: %.2f%n", (celsius * 9/5) + 32);

            System.out.println("A temperatura em Fahrenheit usando o calculo é: "+fahrenheit);
    }
}
