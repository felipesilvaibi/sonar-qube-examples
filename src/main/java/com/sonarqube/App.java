package com.sonarqube;

/**
 * Hello world!!
 *
 */
public class App {
    public static void main(String[] args) {
        double[] precos = new double[]{100.0, 200.0, 300.0};
        double desconto = 0.10; // 10% de desconto

        App app = new App();
        double totalComDesconto = app.calcularTotalComDesconto(precos, desconto);
        System.out.println("Total com desconto: " + totalComDesconto);

        double totalSemDesconto = app.calcularTotalSemDesconto(precos);
        System.out.println("Total sem desconto: " + totalSemDesconto);

        // Código duplicado
        double totalDuplicado = 0.0;
        for (double preco : precos) {
            totalDuplicado += preco;
        }
        totalDuplicado = totalDuplicado - (totalDuplicado * desconto);
        System.out.println("Total duplicado com desconto: " + totalDuplicado);
    }

    // Método para calcular o total com desconto
    public double calcularTotalComDesconto(double[] precos, double desconto) {
        double total = 0.0;

        for (double preco : precos) {
            total += preco;
        }

        double totalComDesconto = total - (total * desconto);
        return totalComDesconto;
    }

    // Método para calcular o total sem desconto
    public double calcularTotalSemDesconto(double[] precos) {
        double total = 0.0;

        for (double preco : precos) {
            total += preco;
        }

        return total;
    }
}
