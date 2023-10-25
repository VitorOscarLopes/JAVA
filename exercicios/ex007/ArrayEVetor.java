public class ArrayEVetor{
    public static void main(String[] args) {
        int[] num = new int[5];
        int[] nums = {10,20,30,40,50};
        num[0]=10;
        num[1]=5;
        num[2]=15;
        num[3]=0;
        num[4]=8;
        //System.out.printf("%d",nums[1]);

        for(int cont=0;cont<nums.length;cont++){
            System.out.printf("Posição %d \n nums = %d e num = %d\n",cont,nums[cont],num[cont]);
        }
    }
}