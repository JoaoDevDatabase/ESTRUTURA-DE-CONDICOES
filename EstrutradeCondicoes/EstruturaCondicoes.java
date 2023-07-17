package EstrutradeCondicoes;

import java.util.Scanner;

public class EstruturaCondicoes {
    public static void main(String[] args) {

        double saldominimo = 20.0;
        double saldosolicitado = 2.0;

        System.out.println("\n*****CAIXA ELETRONICO*****\n");
        System.out.println("SAQUE MINIMO DE R$20,00; QUANTO DESEJA SACAR?");
        if (saldosolicitado < saldominimo) {
            System.out.println("\nVALOR SOLICITADO MENOR QUE O LIMITE MINIMO REQUIRIDO");
        } else {
            System.out.println("\nSAQUE FEITO COM SUCESSO !");
        }

    }
}