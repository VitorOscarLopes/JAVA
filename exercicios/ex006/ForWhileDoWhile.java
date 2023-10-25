import java.util.Scanner;
public class ForWhileDoWhile{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /*for(int cont = 0;cont<5;cont++){
        System.out.println("cont");
    }
    System.out.println("Fim do programa");*/


    /*int cont = 1;
    System.out.println("Número máximo a ser contado:");
    int maxi = scan.nextInt();
    while(cont<(maxi+1)){
        System.out.println(cont+" - CBD Cursos");
        cont++;
    }*/

    int cont = 0;
    System.out.println("Número máximo a ser contado:");
    int maxi = scan.nextInt();
    do{
        System.out.println(cont+" - CBD Cursos");
        cont++;
        }while(cont<maxi);
    
}
}