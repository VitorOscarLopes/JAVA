package banco;

import java.util.Scanner;

public class Bankk {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner (System.in);
        Scanner scan = new Scanner (System.in);
        
        Conta acc1 = new Conta();
        Conta acc2 = new Conta();

        System.out.println("DADOS DA CONTA 1");
        System.out.println("=================");
        System.out.print("Digite o nome:");
        acc1.name = scan1.nextLine();
        System.out.println("------------------");
        System.out.println("Qual a idade de "+acc1.name);
        acc1.age = scan1.nextInt();
        System.out.println("------------------");
        System.out.println("Qual o saldo de"+acc1.name);
        acc1.credit = scan1.nextDouble();
        System.out.println("-----------------------------------------------------------");

        System.out.println("DADOS DA CONTA 2");
        System.out.println("=================");

        System.out.print("Digite o nome:");
        acc2.name = scan.nextLine();
        System.out.println("------------------");

        System.out.println("Qual a idade de "+acc2.name);
        acc2.age = scan1.nextInt();
        System.out.println("------------------");

        System.out.println("Qual o saldo de"+acc2.name);
        acc2.credit = scan1.nextDouble();
        System.out.println("-----------------------------------------------------------");
    }
}
