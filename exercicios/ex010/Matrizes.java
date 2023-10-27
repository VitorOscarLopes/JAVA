import java.security.SecureRandom;
import java.util.Scanner;

public class Matrizes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a quantidade de linhas?");
        int linha= input.nextInt();
        System.out.println("Qual a quantidade de colunas?");
        int coluna= input.nextInt();
        int[][] numeros = new int[linha][coluna];


        for(int l=0;l<linha;l++){
            for(int c=0;c<coluna;c++){
                numeros[l][c] = new SecureRandom().nextInt(100);
                System.out.printf("|%3d |",numeros[l][c]);    
            }
            System.out.println();
        }

        System.out.println("=-=-=-=-=-=-=-=");
        
        for(int l=0;l<linha;l++){
            for(int c=0;c<coluna;c++){
                //numeros[l][c] = new SecureRandom().nextInt(100);
                if(l>=c){
                    System.out.printf("|%3d |",numeros[l][c]);
                }else{
                    System.out.printf("|%3s |","-");
                }
                
            }
            System.out.println();
        }


        System.out.println("=-=-=-=-=-=-=-=");


        for(int l=0;l<linha;l++){
            for(int c=0;c<coluna;c++){
                //numeros[l][c] = new SecureRandom().nextInt(100);
                if(l<=c){
                    System.out.printf("|%3d |",numeros[l][c]);
                }else{
                    System.out.printf("|%3s |","-");
                }
                
            }
            System.out.println();
        }

        System.out.println("=-=-=-=-=-=-=-=");

        for(int l=0;l<linha;l++){
            for(int c=0;c<coluna;c++){
                //numeros[l][c] = new SecureRandom().nextInt(100);
                if(l==c){
                    System.out.printf("|%3d |",numeros[l][c]);
                }else{
                    System.out.printf("|%3s |","-");
                }
                
            }
            System.out.println();
        }

    }
}