import java.util.Scanner;
public class Notas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int tam = 5;
        char[] gabaritos ={'a','a','d','b','c'};
        char[] respostas = new char[tam];
        int totn = 0;
        for(int c =0; c <5; c++){
            System.out.printf("\nQual a resposta da questao %d: ",c+1);
            respostas[c] = input.nextLine().charAt(0);
            if (respostas[c]==gabaritos[c]){
                totn += 1;
            }
        }
        System.out.printf("\nO Aluno acertou o total de %d questoes.",totn);
        System.out.println("\nFim do programa!");
    }
}