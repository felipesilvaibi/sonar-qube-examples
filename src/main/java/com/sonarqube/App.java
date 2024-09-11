package com.sonarqube;

import java.util.Random;

/**
 * Hello world!!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.Vaga();
    }

    public class Estacionamento {
    public static void Vaga() {
        Random random = new Random();  
        int vagaNumero = random.nextInt(100); 
        System.out.println("Vaga Numero: " + vagaNumero);
    }
}
}