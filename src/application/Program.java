package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill conta = new Bill();

        System.out.print("Sexo: ");
        conta.gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        conta.qBeer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        conta.qSoftDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        conta.qBarbecue = sc.nextInt();

        System.out.println();
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", conta.feeding());
        
        if (conta.couvert()== 0.0) {
        	System.out.println("Isento de Couvert");
        }
        else {
        	System.out.printf("Couvert = R$ %.2f\n", conta.couvert());
        }
        System.out.printf("Ingresso = R$ %.2f\n", conta.ticket());

        System.out.println();
        System.out.printf("Valor a pagar: R$ %.2f\n", conta.total());


        sc.close();

    }
}