public class Metodos{
    public static void main(String[] args) {
        for(int i = 0; i < 10;i++){
            System.out.print(i+1+" - ");
            canal();
        }
    }

    public static int soma(int... numeros){
        int res=0;
        for(int i:numeros){
            res += i;
        }
        return res;
    }
    
    public static void canal() {
        System.out.println("CFB Cursos");
        
    }
}