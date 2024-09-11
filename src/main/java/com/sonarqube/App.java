package com.sonarqube;

import java.util.Random;

import com.sonarqube.App.Estacionamento;

/**
 * Hello world!!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        Estacionamento.Vaga(); 
    }

    public static class Estacionamento {
        public static void Vaga() {
            Random random = new Random();  
            int vagaNumero = random.nextInt(100); 
            System.out.println("Vaga Numero: " + vagaNumero);
        }
    }
}