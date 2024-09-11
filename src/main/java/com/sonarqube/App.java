package com.sonarqube;

public class App {

    public static void main( String[] args ) {
        TestCase2();
    }

    public static void TestCase2() {
        int idade = 18;
        
        if (idade < 16) {
            // Dispensado da votação
        } else if (idade < 18) {
            // Voto facultativo
        }

    }

}