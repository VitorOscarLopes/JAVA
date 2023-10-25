public class CursoJava{
    public static void main(String[] args) {
        System.out.println("Switch case!");
        int pos= 7;
        switch(pos){
            case 1:
                System.out.println("Primeiro lugar!");
                break;
            case 2:
                System.out.println("Segundo lugar!");
                break;            
            case 3:
                System.out.println("Terceiro lugar!");
                break;
            case 4: case 5: case 6: 
                System.out.println("Honra ao mérito!");
                break;
            default:
                System.out.println("7+");
                break;
        }
    }
}
