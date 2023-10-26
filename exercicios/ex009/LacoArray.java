import java.util.Arrays;

public class LacoArray{
    public static void main(String[] args) {
        //final int tam = 10;
        int x = 4;
        int num[]={0,8,6,5,9,7,3,1,2,4};
        
        //int numeros[] = new int[tam];
        //Arrays.sort(num);
        //Arrays.fill(numeros,10);
        //System.arraycopy(num, 0, numeros, 0, tam);
        //Arrays.equals(num, numeros);
        Arrays.sort(num);
        int pos = Arrays.binarySearch(num,x);
        System.out.printf("O valor %d está no array num? %s na posição %d\n", x, pos > 0 ?"Sim":"Não",pos);


        //System.out.printf("Os Arrays são iguais? %s", Arrays.equals(num, numeros)? "Sim":"Não");

        for(int j:num){
            System.out.printf("%d - ",j);
        }
    }

}