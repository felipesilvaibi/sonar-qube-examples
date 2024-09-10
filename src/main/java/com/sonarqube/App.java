package com.sonarqube;public class App 
{
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        
        double[] precos = {100.0, 200.0, 300.0};
        double desconto = 0.10; // 10% de desconto
        
        double totalComDesconto = calculadora.calcularTotalComDesconto(precos, desconto);
        System.out.println("Total com desconto: " + totalComDesconto);
        
        double totalSemDesconto = calculadora.calcularTotalSemDesconto(precos);
        System.out.println("Total sem desconto: " + totalSemDesconto);
    }

    // Método para calcular o total com desconto
    public double calcularTotalComDesconto(double[] precos, double desconto) {
        double total = 0.0;

        for (double preco : precos) {
            total += preco;
        }

        double totalComDesconto = total - (total * desconto);
        
        // Código duplicado
        double totalDuplicado = total - (total * desconto);
        return totalComDesconto;
    }

    // Método para calcular o total sem desconto
    public double calcularTotalSemDesconto(double[] precos) {
        double total = 0.0;

        for (double preco : precos) {
            total += preco;
        }

        // Código duplicado
        double totalDuplicado = total;
        return total;
    }
}
