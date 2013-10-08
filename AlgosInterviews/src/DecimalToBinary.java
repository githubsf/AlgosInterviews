import java.util.Arrays;


public class DecimalToBinary {
 
    public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        /*
       //System.out.println("\n" + Arrays.toString(binary));
       prints out : [1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
       */
    }
     
    public static void main(String a[]){
        DecimalToBinary dtb = new DecimalToBinary();
        dtb.printBinaryFormat(25);
    }
}