import java.util.Scanner;

public class Scanzin{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,res;
        
        System.out.println("Digite um número:");
        n1 = scan.nextInt();
        System.out.println("Digite outro número:");
        n2 = scan.nextInt();
        res=n1+n2;
        System.out.printf("O resultado da soma de %d e %d vale %d",n1,n2,res);
        
    }
}
