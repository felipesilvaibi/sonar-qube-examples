package com.sonarqube;

/**
 * Hello world!!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
       boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1) {
            System.out.println("Condicao 1 é verdadeira");
        } if (condicao2) {  // quebra: condição 2 é parte do bloco anterior 1
            System.out.println("Condicao 2 é verdadeira");
        }
    }
}